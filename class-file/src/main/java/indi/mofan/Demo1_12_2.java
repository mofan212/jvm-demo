package indi.mofan;


/**
 * @author mofan
 * @date 2025/10/7 14:22
 */
public class Demo1_12_2 {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int i = 10;
        try {
            return i;
        } finally {
            i = 20;
        }
    }
}
