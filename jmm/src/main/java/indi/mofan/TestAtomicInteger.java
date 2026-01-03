package indi.mofan;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mofan
 * @date 2026/1/3 20:50
 */
public class TestAtomicInteger {
    private static final AtomicInteger I = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 5000; j++) {
                // i++
                I.getAndIncrement();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 5000; j++) {
                // i--
                I.getAndDecrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(I);
    }
}
