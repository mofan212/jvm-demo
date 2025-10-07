package indi.mofan.candy;


/**
 * @author mofan
 * @date 2026/1/1 19:41
 */
public class Candy11_2 {
    public static void test(final int x) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok" + x);
            }
        };
    }

    final class Candy11$1 implements Runnable {
        int val$x;

        public Candy11$1(int val$x) {
            this.val$x = val$x;
        }

        @Override
        public void run() {
            System.out.println("ok" + this.val$x);
        }
    }
}
