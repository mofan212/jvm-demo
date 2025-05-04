package indi.mofan;


/**
 * @author mofan
 * @date 2025/5/4 18:02
 */
public class Demo_3_2 {
    public static void main(String[] args) {
        intern1();
        intern2();
    }

    private static void intern1() {
        String s = new String("a") + new String("b");
        String s2 = s.intern();
        // true
        System.out.println(s2 == "ab");
        // true
        System.out.println(s == "ab");
    }

    private static void intern2() {
        String x = "ab";
        String s = new String("a") + new String("b");
        String s2 = s.intern();
        // true
        System.out.println(s2 == x);
        // false
        System.out.println(s == x);
    }
}
