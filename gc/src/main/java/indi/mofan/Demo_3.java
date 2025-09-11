package indi.mofan;


import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mofan
 * @date 2025/9/11 16:56
 */
public class Demo_3 {

    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) {
        weak();
    }

    private static void weak() {
        List<WeakReference<byte[]>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            WeakReference<byte[]> ref = new WeakReference<>(new byte[_4MB]);
            list.add(ref);
            for (WeakReference<byte[]> x : list) {
                System.out.print(x.get() + " ");
            }
            System.out.println();
        }
        System.out.println("循环结束: " + list.size());
    }
}
