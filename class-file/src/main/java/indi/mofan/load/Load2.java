package indi.mofan.load;


import java.io.IOException;

/**
 * @author mofan
 * @date 2026/1/1 21:16
 */
public class Load2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoader loader = Load2.class.getClassLoader();
        // loadClass 方法不会导致类的解析和初始化
        Class<?> cClazz = loader.loadClass("indi.mofan.load.C");

        // new C();
        System.in.read();
    }
}

class C {
    D d = new D();
}

class D {
}
