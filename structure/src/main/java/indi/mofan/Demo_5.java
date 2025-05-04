package indi.mofan;


/**
 * -Xmx10m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails -verbose:gc
 *
 * @author mofan
 * @date 2025/5/4 20:58
 */
public class Demo_5 {
    public static void main(String[] args) {
        int i  = 0;
        try {
            for (int j = 0; j < 10000; j++) {
                String.valueOf(i).intern();
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }
    }
}
