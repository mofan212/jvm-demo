package indi.mofan;


import java.util.ArrayList;
import java.util.List;

/**
 * 指定最大堆内存为 10m: -Xmx10m
 * 关闭 UseGCOverheadLimit: -XX:-UseGCOverheadLimit
 *
 * @author mofan
 * @date 2025/5/4 20:33
 */
public class Demo_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        try {
            for (int j = 0; j < 260000; j++) {
                list.add(String.valueOf(j).intern());
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }

    }
}
