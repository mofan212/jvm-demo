package indi.mofan;


/**
 * @author mofan
 * @date 2025/10/6 17:27
 */
public class Demo1_11_4 {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = 10;
        } catch (Exception e) {
            i = 20;
        } finally {
            i = 30;
        }
    }
}
