package indi.mofan;


/**
 * @author mofan
 * @date 2025/10/7 13:49
 */
public class Demo1_12_1_1 {
    public static void main(String[] args) {
        // 始终返回 20，且没有异常
        System.out.println(test());
    }

    public static int test() {
        try {
            int i = 1 / 0;
            return 10;
        } finally {
            return 20;
        }
    }
}
