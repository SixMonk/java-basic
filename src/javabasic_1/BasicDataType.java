package javabasic_1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * java基本数据类型
 */
public class BasicDataType {
    public static void main(String[] args) {
        /**
         * java基本数据类型：Interge,Long,Double,BigDecimail,Float,Charter,Byte,Boolean
         * 1. 基本值类型转包装类型 java提供自动的装箱 和 拆箱
         * 2. 不同值类型的转换 有 intValue(), longValue();...方法
         * 3. BigDecimal 没有对于的基本类型 ,一般的操作在与精度的操作  有四舍五入，直接截取 之分
         * 4. DecimalFormat 用于格式化 基本类型
         * 5. Math方法 提供了 四舍五入 向上取整,像下取整
         * 6. String 常用的方法  ：equal(),toLowerCase(),format(),split(),trim()
         * 7. StringBuilder() : append(), toString();
         */

        //1. 自动装拆箱
        Integer integer = 123;
        //2. 转为long类型
        Long longNum = integer.longValue();
        //3.BigDecimal
        BigDecimal decimal = new BigDecimal(998.5680);
        //3.1 直接截取1位
        BigDecimal decimal1 = decimal.setScale(1,BigDecimal.ROUND_DOWN);
        System.out.println("BigDecimal 998.5680 :截取1位 " + decimal1);
        //3.2 四舍五入
        BigDecimal decimal2 = decimal.setScale(1,BigDecimal.ROUND_HALF_UP);
        System.out.println("BigDecimal 998.5680:四舍五入 " + decimal1);
        //4. DecimalFormat
        DecimalFormat format = new DecimalFormat("0.0");
        System.out.println("DecimalFormat : 0.0 => " + format.format(decimal));
        //5. Math方法
        System.out.println("Math 向上取整 ：" + Math.ceil(decimal.doubleValue()));
        System.out.println("Math 向下取整 ：" + Math.floor(decimal.doubleValue()));
        System.out.println("Math 四舍五入 ：" + Math.round(decimal.doubleValue()));
        //6. 注意equal 和 == 的区别 ,equal只比较其值, ==比较引用类型在堆中的内存地址是否相等?
    }
}
