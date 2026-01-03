package indi.mofan.avo;


/**
 * @author mofan
 * @date 2026/1/3 14:05
 */
public class Demo4_1 {

    static int i = 0;

    static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 5000; j++) {
                // 加锁、减锁操作会执行 5000 次，更建议将其放到 for 循环外
                synchronized (obj) {
                    i++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 5000; j++) {
                synchronized (obj) {
                    i--;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);
    }
}
