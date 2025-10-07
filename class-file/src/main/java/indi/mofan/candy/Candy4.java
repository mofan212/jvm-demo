package indi.mofan.candy;


import java.util.Arrays;

/**
 * @author mofan
 * @date 2025/10/7 16:45
 */
public class Candy4 {
    public static void foo(String... args) {
        // 可变参数可直接赋值给数组
        String[] array = args;
        System.out.println(Arrays.toString(array));
    }

    // public static void foo(String[] args) {
    //     String[] array = args;
    //     System.out.println(Arrays.toString(array));
    // }
    //
    // public static void main(String[] args) {
    //     // foo("hello", "world");
    //     foo(new String[]{"hello", "world"});
    // }
}
