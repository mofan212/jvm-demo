package indi.mofan.candy;


/**
 * @author mofan
 * @date 2025/10/7 16:52
 */
public class Candy5_1 {
    public static void main(String[] args) {
        // 数组赋初值的简化写法也是语法糖
        int[] array = {1, 2, 3, 4, 5};
        for (int x : array) {
            System.out.println(x);
        }
    }

    // public Candy5_1() {
    // }
    //
    // public static void main(String[] args) {
    //     int[] array = new int[]{1, 2, 3, 4, 5};
    //     for (int i = 0; i < array.length; ++i) {
    //         int x = array[i];
    //         System.out.println(x);
    //     }
    // }
}
