import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        testJavaReflaction();
    }

    public static void testJavaReflaction() {
        Class c = null ;
        try {
             c = Class.forName("People");
        } catch (Exception e) {
            System.out.println("not find class Pepole");
        }
        People people =null ;
        if (c != null) {
            try {
                people = (People) c.newInstance();
            } catch (Exception e) {
                System.out.println("error");
            }
        }




    }

    /**
     * java 基本数据类型
     * Interer
     * Long
     * Fl
     */
    public static void testJavaDataStructure() {
        Integer integer = 11;
        int num = 11;

        Long longNum = 22L;
        long longNumBasic = 22;

        Double doubleNum = 33.3D;
        double doubleNumBasic =33.3;

        Float floatNum = 44.4F;
        float floatNumBasic = 44.4F;

        BigDecimal decimalNum = new BigDecimal(2.35);

        Boolean flag = true;
        boolean flagBasic = true;

        Character character = 'c';
        char charBasic = 'd';

        Byte byteNum =66;
        byte byteNumBasic = 66;

        integer = longNum.intValue();
        longNum = integer.longValue();

        integer = doubleNum.intValue();

        // str -> int
        String strInt = "33";
        integer = Integer.parseInt(strInt);

        //包装类可以 Interger -> long 可以用 longvalue,
        //非包装类 int -> Long 可以强转
        int p = 33;
        Long lo =(long)p;

        //System.out.println("integer : " + integer);

        Integer integer1 = 33;
        Integer integer2 = new Integer(33);
        //System.out.println(integer1 == integer2);
        //System.out.println(integer1.equals(integer2));

        //System.out.println(integer2.toString());

        //System.out.println("format decimal :" + new DecimalFormat("0.0").format(decimalNum));
        //System.out.println("1" + decimalNum.setScale(1));
        //System.out.println("1,round_down" + decimalNum.setScale(1, BigDecimal.ROUND_DOWN));
        //System.out.println("1, round_half_up" + decimalNum.setScale(1,BigDecimal.ROUND_HALF_UP));
        //System.out.println("1, round_half_down" + decimalNum.setScale(1,BigDecimal.ROUND_HALF_DOWN));

        Double doubleValue = 2.35;
        System.out.println("Math.round" + Math.round(doubleValue));
        System.out.println("Math.ceil" + Math.ceil(doubleValue));
        System.out.println("Math.floor" + Math.floor(doubleValue));

        System.out.println(People.class);

    }

    /**
     * String
     */
    public static void TestJavaStringClass() {
        //String.Format()
        //replace tolowercase touppercase
        StringBuilder stringBuilder = new StringBuilder();
        String testStr = "hahaha";
    }

}
