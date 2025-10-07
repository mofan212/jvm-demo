package indi.mofan.candy;


/**
 * @author mofan
 * @date 2025/10/7 19:56
 */
public class Candy7 {

    // static class $MAP {
    //     static int[] map = new int[2];
    //
    //     static {
    //         map[Sex.MALE.ordinal()] = 1;
    //         map[Sex.FEMALE.ordinal()] = 2;
    //     }
    // }
    //
    // public static void foo(Sex sex) {
    //     int x = $MAP.map[sex.ordinal()];
    //     switch (x) {
    //         case 1:
    //             System.out.println("男");
    //             break;
    //         case 2:
    //             System.out.println("女");
    //             break;
    //     }
    // }

    public static void foo(Sex sex) {
        switch (sex) {
            case MALE:
                System.out.println("男");
                break;
            case FEMALE:
                System.out.println("女");
                break;
        }
    }
}
