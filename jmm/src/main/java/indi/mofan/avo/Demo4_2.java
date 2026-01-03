package indi.mofan.avo;


/**
 * @author mofan
 * @date 2026/1/3 15:08
 */
public class Demo4_2 {

    static volatile boolean run =  true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (run) {
                // ...
            }
        });

        t.start();

        Thread.sleep(1000);

        // 线程 t 并不按预想的那样停下来
        run = false;
    }
}
