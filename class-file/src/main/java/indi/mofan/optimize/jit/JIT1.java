package indi.mofan.optimize.jit;


/**
 * @author mofan
 * @date 2026/1/2 14:38
 */
public class JIT1 {

    // -XX:-DoEscapeAnalysis
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < 1000; j++) {
                new Object();
            }
            long end = System.nanoTime();
            System.out.printf("%d\t%d\n", i, end - start);
        }
    }
}
