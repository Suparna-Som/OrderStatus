package com.futurewise.app.Dao;

import com.futurewise.app.Exception.FuturewiseAppException;
import com.futurewise.app.Model.TpTransaction;
import com.futurewise.app.Table.TpTransactionTable;
import com.futurewise.app.Utils.Constants;
import com.futurewise.app.dbfw.DB;
import com.futurewise.app.dbfw.ResultsetProcessor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TpTransactionDao {
    public static final String GET_TRANSACTION = "select b.`bank_logo_url`, " + TpTransactionTable.ID + " , " +
            TpTransactionTable.ADVISOR_ID + " , " + TpTransactionTable.FAMILY_MEMBER_ID + " , " +
            TpTransactionTable.BROKER_CODE + " , " +
            TpTransactionTable.CLIENT_ID + " , " + TpTransactionTable.UNIQUE_NO + " , " +
            TpTransactionTable.TRANSACTION_NO + " , " + TpTransactionTable.CLIENT_NAME + " , " +
            TpTransactionTable.FOLIO + " , " + TpTransactionTable.SCHEME_CODE + " , " +
            TpTransactionTable.SCHEME_NAME + " , " + TpTransactionTable.AMT + " , " +
            TpTransactionTable.QUANTITY + " , " + TpTransactionTable.AMT_UNIT_TYPE + " , " +
            TpTransactionTable.PAYMENT_LINK + " , " + TpTransactionTable.STATUS + " , " +
            TpTransactionTable.STATUS_DESC + " , " + TpTransactionTable.TRANSACTION_TYPE + " , " +
            TpTransactionTable.SUB_TRANSACTION_TYPE + " , " + TpTransactionTable.SERVICE_MESSAGE + " , " +
            TpTransactionTable.TARGET_PRODUCT_CODE + " , " + TpTransactionTable.TARGET_PRODUCT_NAME + " , " +
            TpTransactionTable.CLIENT_CODE + " , " + TpTransactionTable.ORDER_DATE + " , " +
            TpTransactionTable.RETURN_MESSAGE + " , " + TpTransactionTable.AGGREGATOR_TYPE + " , "
            + TpTransactionTable.EUIN + " , " +
            TpTransactionTable.TRANSACTION_INITIATION_TIME + " , " + TpTransactionTable.HOLDING_NATURE + " , " +
            TpTransactionTable.BANK_NAME + " , " + TpTransactionTable.BANK_ACCOUNT_NUMBER + " , " +//30
            TpTransactionTable.BANK_ACCOUNT_TYPE + " , " + TpTransactionTable.UMRN_NO + " , " +
            TpTransactionTable.PAYMENT_MODE + " , " + TpTransactionTable.START_DATE + " , " +
            TpTransactionTable.END_DATE + " , " + TpTransactionTable.FREQUENCY + " , " +
            TpTransactionTable.NUMBER_OF_INSTALLMENT + " , " + TpTransactionTable.PERPETUAL_FLAG + "," +//38
            TpTransactionTable.CREATED_ON + " , " + TpTransactionTable.ORDERSTATUSUPDATE +

            " from " + TpTransactionTable.TABLE_NAME + " left join  (select `bank_code`, `bank_logo_url` from `bank_master` where `bank_code` is not null and `bank_code` not like '') b on bank_name=b.bank_code where ";

    public TpTransaction getTpTransaction(long transactionId) throws FuturewiseAppException {
        List inParams = new ArrayList();
        inParams.add(transactionId);
        final TpTransaction[] tpTransactionModel = {null};
        DB.list(Constants.DEFAULT_DB, TpTransactionDao.GET_TRANSACTION + " id = ? ", inParams, new ResultsetProcessor() {
            @Override
            public void process(List<Map<String, Object>> rows) throws SQLException {
                for (Map<String, Object> row : rows) {
//                    tpTransactionModel[0] = mapRowToModel(row);
                }
            }
        });
        return tpTransactionModel[0];

    }

}
