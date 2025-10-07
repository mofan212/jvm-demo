package indi.mofan.candy;


/**
 * @author mofan
 * @date 2025/10/7 19:10
 */
public class Candy6_1 {
    public static void choose(String str) {
        switch (str) {
            case "hello": {
                System.out.println("h");
                break;
            }
            case "world": {
                System.out.println("w");
            }
        }
    }


    // public Candy6_1() {
    // }
    //
    // public static void choose(String str) {
    //     byte x = -1;
    //     switch (str.hashCode()) {
    //         case 99162322: {
    //             if (str.equals("hello")) {
    //                 x = 0;
    //             }
    //             break;
    //         }
    //         case 113318802: {
    //             if (str.equals("world")) {
    //                 x = 1;
    //             }
    //         }
    //     }
    //     switch (x) {
    //         case 0:
    //             System.out.println("h");
    //             break;
    //         case 1:
    //             System.out.println("w");
    //     }
    // }
}
