package indi.mofan;


/**
 * @author mofan
 * @date 2025/10/7 14:37
 */
public class Demo1_13 {
    public static void main(String[] args) {
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("ok");
        }
    }
}
