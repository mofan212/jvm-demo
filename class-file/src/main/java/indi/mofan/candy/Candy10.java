package indi.mofan.candy;


import java.lang.reflect.Method;

/**
 * @author mofan
 * @date 2026/1/1 19:26
 */
public class Candy10 {
    static class A {
        public Number m() {
            return 1;
        }
    }

    static class B extends A {
        @Override
        // 子类 m 方法的返回值是 Integer，是父类 m 方法返回值 Number 的子类
        public Integer m() {
            return 2;
        }
    }

    public static void main(String[] args) {
        for (Method method : B.class.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
