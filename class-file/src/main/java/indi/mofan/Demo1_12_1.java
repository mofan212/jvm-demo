package indi.mofan;


/**
 * @author mofan
 * @date 2025/10/6 18:55
 */
public class Demo1_12_1 {
    public static int test() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String[] args) {
        // 20
        System.out.println(test());
    }
}
