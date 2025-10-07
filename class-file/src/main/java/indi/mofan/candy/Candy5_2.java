package indi.mofan.candy;


import java.util.Arrays;
import java.util.List;

/**
 * @author mofan
 * @date 2025/10/7 18:55
 */
public class Candy5_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer x : list) {
            System.out.println(x);
        }
    }

    // public Candy5_2() {
    // }
    //
    // public static void main(String[] args) {
    //     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    //     Iterator iterator = list.iterator();
    //     while (iterator.hasNext()) {
    //         Integer x = (Integer) iterator.next();
    //         System.out.println(x);
    //     }
    // }
}
