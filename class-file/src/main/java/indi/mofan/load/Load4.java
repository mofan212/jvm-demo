package indi.mofan.load;


/**
 * @author mofan
 * @date 2026/1/1 22:16
 */
public class Load4 {
    public static void main(String[] args) {
        System.out.println(E.a);
        System.out.println(E.b);
        System.out.println(E.c);
    }
}

class E {
    public static final int a = 10;
    public static final String b = "hello";

    // 需要装箱，会触发初始化
    public static final Integer c = 20;

    static {
        System.out.println("init E");
    }
}
