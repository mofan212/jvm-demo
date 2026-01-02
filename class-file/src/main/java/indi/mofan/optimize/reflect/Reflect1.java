package indi.mofan.optimize.reflect;


import java.lang.reflect.Method;

/**
 * @author mofan
 * @date 2026/1/2 15:50
 */
public class Reflect1 {
    public static void foo() {
        System.out.println("foo...");
    }

    public static void main(String[] args) throws Exception {
        Method foo = Reflect1.class.getMethod("foo");
        // 17 次反射调用
        for (int i = 1; i <= 17; i++) {
            long start = System.nanoTime();
            // System.out.printf("%d\t", i);
            foo.invoke(null);
            System.out.printf("%d\t%d\n", i, System.nanoTime() - start);
        }
        // System.in.read();
    }
}
