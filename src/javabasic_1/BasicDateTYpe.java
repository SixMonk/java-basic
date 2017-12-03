package javabasic_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BasicDateTYpe {
    public static void main(String[] args) {
        /**
         * java 日期主要由 1. java.util.Date
         *                              |-java.sql.Date
         *                              |-java.sql.Time
         *                              |-java.sql.TimeStamp
         *               2. Calendar
         *               3. DateFormat
         *                          |-SimpleDateFomat
         *  其中 Date主要用于显示日期类型，其为java1.0的类库，设计不合理
         *  故日期的相关操作都有Calendar类负责
         *  Datefomat类主要负责 日期的格式话，将固定格式的string日期转化为date
         *                                 将date转为为固定格式的string日期
         */

        //1. Date 中的before after方法
        testDateMethod();

    }

    private static void testDateMethod() {
        /**
         * java.util.Date中的比较日期
         * before()  ;  after() ; 方法
         */
        Date date1 = new Date();
        date1.setTime(1510493100); //2017/11/12 21:25:0

        Date date2 = new Date();
        date2.setTime(1510488000); //2017/11/12 20:00:0

        System.out.println("date1 before date2 :" + date1.before(date2));
        System.out.println("date1 after date2 :" + date1.after(date2));

        // x轴 0点到24点 前->后
        // date1.after(date2) 可翻译为 date1在date2之后
    }
    /**
     * 增加日期中某些类型的某数值
     * @param date java.util
     * @param dateType
     * @param amount
     * @return java.date
     */
    public static Date addInteger(Date date, int dateType, int amount) {
        Date myDate = null;
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(dateType, amount);
            myDate = calendar.getTime();
        }
        return myDate;
    }

    /**
     * util date -> sql date
     * @param utilDate
     * @return
     */
    public static java.sql.Date utilDateToSqlDate(java.util.Date utilDate) {
        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            sqlDate = new java.sql.Date(utilDate.getTime());
        }
        return sqlDate;
    }

    /**
     * date -> string format方法
     *
     * @param date
     * @return
     */
    public static String utilDateToString(Date date) {
        String strDate = null;
        if (date != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            strDate = format.format(date);
        }
        return strDate;
    }

    /**
     * str -> date parse方法
     * @param strDate
     * @param paternStr
     * @return
     */
    public static Date stringToUtilDate(String strDate,String paternStr) {
        Date date;
        try {
            SimpleDateFormat format = new SimpleDateFormat(paternStr);
            date=  format.parse(strDate);
        } catch (Exception e) {
            date = null;
        }
        return date;
    }

}
