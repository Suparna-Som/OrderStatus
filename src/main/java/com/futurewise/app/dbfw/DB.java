package com.futurewise.app.dbfw;


import com.futurewise.app.Exception.FuturewiseAppException;
import com.futurewise.app.Utils.Validator;
import io.sentry.Sentry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public final class DB {

    @Autowired
    private static ApplicationContext applicationContext;

    public static void list(String dbName, String query, List inParams, ResultsetProcessor processor) throws FuturewiseAppException {
        try {
            JdbcTemplate mySqlJDBCTemplate = getJDBCTemplate(dbName);
            List<Map<String, Object>> rows = new ArrayList<>();
            try {
                if (Validator.isEmpty(inParams)) {
//                    rows = DBEncrypt.decrypt(mySqlJDBCTemplate.queryForList(query));
                    rows = mySqlJDBCTemplate.queryForList(query);
                    processor.process(rows);
                } else {
//                    rows =  DBEncrypt.decrypt(mySqlJDBCTemplate.queryForList(query, setINParameters(inParams)));
                    rows = mySqlJDBCTemplate.queryForList(query, setINParameters(inParams));
                    processor.process(rows);
                }
            } finally {
                mySqlJDBCTemplate = null;
                rows = null;
            }
        } catch (SQLException sqe) {
            throw new FuturewiseAppException(sqe);
        }
    }

    public static int insert(String dbName, String query, List inParams) {
        JdbcTemplate mySqlJDBCTemplate = null;
        try {
            mySqlJDBCTemplate = getJDBCTemplate(dbName);
//            System.out.println(Arrays.toString(setINParameters(inParams)));
            return mySqlJDBCTemplate.update(query, setINParameters(inParams));
        } finally {
            mySqlJDBCTemplate = null;
        }
    }

    public static List<Map<String, Object>> insertAndGetLastInsertedRowIdMultiple(String dbName, String query, List inParams) {
        JdbcTemplate mySqlJDBCTemplate = null;
        GeneratedKeyHolder holder = null;
        try {
            mySqlJDBCTemplate = getJDBCTemplate(dbName);
            holder = new GeneratedKeyHolder();
            mySqlJDBCTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                    PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                    int paramIndex = 1;
                    setINParameters(inParams, statement, paramIndex);
                    return statement;
                }
            }, holder);
        } finally {

        }
        return holder.getKeyList();
    }

    public static Long insertAndGetLastInsertedRowId(String dbName, String query, List inParams) {
        JdbcTemplate mySqlJDBCTemplate = null;
        GeneratedKeyHolder holder = null;
        try {
            mySqlJDBCTemplate = getJDBCTemplate(dbName);
            holder = new GeneratedKeyHolder();
            mySqlJDBCTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                    PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                    int paramIndex = 1;
                    setINParameters(inParams, statement, paramIndex);
                    return statement;
                }
            }, holder);
        } catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        return holder.getKey().longValue();
    }

    public static int delete(String dbName, String query, List inParams) {

        JdbcTemplate mySqlJDBCTemplate = getJDBCTemplate(dbName);
        return mySqlJDBCTemplate.update(query, setINParameters(inParams));
    }

    public static int update(String dbName, String query, List inParams) {

        JdbcTemplate mySqlJDBCTemplate = getJDBCTemplate(dbName);
        return mySqlJDBCTemplate.update(query, setINParameters(inParams));
    }

    private static Object[] setINParameters(List inParams) {

        if (!Validator.isEmpty(inParams)) {
            return inParams.toArray();
//            return DBEncrypt.encryptParam(inParams);
        } else {
            return null;
        }
    }

    public static int getIntegerValue(String dbName, String query, List inParams) {
        JdbcTemplate jdbcTemplate = getJDBCTemplate(dbName);
        return jdbcTemplate.queryForObject(query, setINParameters(inParams), Integer.class);
    }

    public static String getString(String dbName, String query, List inParams) {
        JdbcTemplate jdbcTemplate = getJDBCTemplate(dbName);
        return jdbcTemplate.queryForObject(query, setINParameters(inParams), String.class);
    }

    public static <T> T getObject(String dbName, String query, List inParams, Class<T> requiredType) {
        JdbcTemplate jdbcTemplate = getJDBCTemplate(dbName);

        List<Class<T>> outputList = jdbcTemplate.query(query, setINParameters(inParams), new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getObject(1);
            }
        });

        if (outputList.isEmpty()) {
            return null;
        } else if (outputList.size() == 1) { // list contains exactly 1 element
            return (T) outputList.get(0);
        } else {
            String message = "Faulty output for query : " + query + " for params: " + inParams.toString();
            Sentry.capture(message);
            return (T) outputList.get(0);
        }
    }

    public static Double getDouble(String dbName, String query, List inParams) {
        JdbcTemplate jdbcTemplate = getJDBCTemplate(dbName);
        return jdbcTemplate.queryForObject(query, setINParameters(inParams), Double.class);
    }

    public static int setINParameters(List inParams, PreparedStatement statement, int inParamIndex) throws SQLException {

        if (!Validator.isEmpty(inParams)) {
            for (Object param : inParams) {

                if (param == null) {
                    statement.setObject(inParamIndex, null);
                } else if (param instanceof String) {
                    statement.setString(inParamIndex, param.toString());
                } else if (param instanceof Integer) {
                    statement.setInt(inParamIndex, (Integer) param);
                } else if (param instanceof Double) {
                    statement.setDouble(inParamIndex, (Double) param);
                } else if (param instanceof Time) {
                    statement.setTime(inParamIndex, (Time) param);
                } else if (param instanceof Timestamp) {
                    statement.setTimestamp(inParamIndex, (Timestamp) param);
                } else if (param instanceof Date) {
                    statement.setDate(inParamIndex, new java.sql.Date(((Date) param).getTime()));
                } else if (param instanceof Long) {
                    statement.setLong(inParamIndex, (Long) param);
                } else {
                    statement.setObject(inParamIndex, param);
                }
//                }else {
//                    statement.setString(inParamIndex, EncryptionUtil.base64Encode(param.toString()));
//                }
                inParamIndex++;
            }

        }
        return inParamIndex;
    }

    public static void batchExecution(String dbName, String query, List<Object[]> inParamList) throws DataAccessException {
        getJDBCTemplate(dbName).batchUpdate(query, inParamList);
    }

//    public static Future<?> asyncBatchExecution(String dbName, String query, List<Object[]> inParamList, int priority) throws RejectedExecutionException {
//        return QueuingService.addTask(new Runnable()
//        {
//            @Override
//            public void run() {
//                try {
//                    System.out.println(new Date() + " Start Insert " + Thread.currentThread().getId());
//                    batchExecution(dbName, query, inParamList);
//                    System.out.println(new Date() + " End Insert " + Thread.currentThread().getId());
//                } catch (DataAccessException e) {
//                    e.printStackTrace();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }, priority);
//    }

    public static JdbcTemplate getJDBCTemplate(String dbName) {
        JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
        DataSource dataSource = dataSourceLookup.getDataSource(dbName);
        return new JdbcTemplate(dataSource);
    }
}
