package indi.mofan.optimize.jit;


/**
 * @author mofan
 * @date 2026/1/2 15:02
 */
public class JIT2 {
    private static int square(final int i) {
        return i * i;
    }

    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 500; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < 1000; j++) {
                x = square(9);
            }
            long end = System.nanoTime();
            System.out.printf("%d\t%d\t%d\n", i, x, end - start);
        }
    }
}
