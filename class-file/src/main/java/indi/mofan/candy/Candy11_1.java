package indi.mofan.candy;


/**
 * @author mofan
 * @date 2026/1/1 19:36
 */
public class Candy11_1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("ok");
            }
        };
    }

    final class Candy11$1 implements Runnable {
        public Candy11$1() {
        }

        @Override
        public void run() {
            System.out.println("ok");
        }
    }
}
