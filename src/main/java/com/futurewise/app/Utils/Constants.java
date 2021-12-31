package com.futurewise.app.Utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String TEST_DB = "java:comp/env/jdbc/money_manager_test";
    public static final String DEFAULT_DB = TEST_DB;
    public static final List<String> PUBLIC_HOLIDAYS_2022 = new ArrayList<String>(){{
        add("26/01/2022");
        add("01/03/2022");
        add("18/03/2022");
        add("14/04/2022");
        add("15/04/2022");
        add("03/05/2022");
        add("09/08/2022");
        add("15/08/2022");
        add("31/08/2022");
        add("05/10/2022");
        add("24/10/2022");
        add("26/10/2022");
        add("08/11/2022");
    }};
    public static final Integer ZERO = 0;
    public static String BASE_URL_STAR_MF_SERVICE = "http://www.bsestarmf.in/2016/01/IStarMFWebService";
    public static String START_MF_GET_ORDER_STATUS = BASE_URL_STAR_MF_SERVICE + "/OrderStatus";

}
