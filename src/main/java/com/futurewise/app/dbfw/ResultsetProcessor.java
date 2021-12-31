package com.futurewise.app.dbfw;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ResultsetProcessor {

    void process(List<Map<String, Object>> rows)  throws SQLException;
}
