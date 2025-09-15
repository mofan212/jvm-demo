package indi.mofan;


import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
 * -Xms20M -Xmx20M 堆初始大小 20M，堆最大大小 20M
 * -Xmn10M 新生代大小 10M
 * -XX:+UseSerialGC 使用串行回收器进行回收，在新生代使用复制，在老年代使用标记-整理
 *
 * @author mofan
 * @date 2025/9/15 19:32
 */
public class Demo_4 {
    private static final int _512KB = 512 * 1024;
    private static final int _1M = 1024 * 1024;
    private static final int _6M = 6 * 1024 * 1024;
    private static final int _7M = 7 * 1024 * 1024;
    private static final int _8M = 8 * 1024 * 1024;

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        list.add(new byte[_7M]);
        list.add(new byte[_512KB]);
        list.add(new byte[_512KB]);
    }
}
