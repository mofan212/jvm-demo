package indi.mofan;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mofan
 * @date 2025/10/6 16:39
 */
public class Demo1_11_3 {
    public static void main(String[] args) {
        try {
            Method test = Demo1_11_3.class.getMethod("test");
            test.invoke(null);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void test() {
        System.out.println("ok");
    }
}
