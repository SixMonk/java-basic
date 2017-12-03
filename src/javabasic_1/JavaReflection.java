package javabasic_1;

import entity.People;
import entity.ReflactionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JavaReflection {
    public static void main(String[] args) {
        /**
         * https://www.cnblogs.com/zhguang/p/3091378.html
         * java获得Class对象 类似与net中的 Type类
         *
         */
        try {
            //获得类对象
            Class c1 = Class.forName("entity.ReflactionTest");
            Object rt = c1.newInstance();
            /*
            People people = new People();
            Class c2 = people.getClass();

            Class c3 = People.class;
            */
            //获得超类
            Class<?> superClass = c1.getSuperclass();
            System.out.println("get superClass :" + superClass);
            //获得所有父接口
            Class<?>[] interfaces = c1.getInterfaces();
            System.out.println("get all interface: " +interfaces);
            //获得所有属性为public的构造方法
            Constructor<?>[] constructors = c1.getConstructors();
            System.out.println("get all constructors :" + constructors);
            //获得public方法
            Method method = c1.getMethod("print");
            //调用方法
            method.invoke(rt);
            //获得private方法
            Method privateMethod = c1.getDeclaredMethod("pTestParam", Integer.class);
            privateMethod.setAccessible(true);
            privateMethod.invoke(rt,999);
            //获得当前的类加载器
            System.out.println("当前类加载器：" + c1.getClassLoader().getClass().getName());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
