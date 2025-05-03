package indi.mofan;


import java.util.ArrayList;

/**
 * @author mofan
 * @date 2025/5/3 21:15
 */
public class Demo_1 {
    public static void main(String[] args) {
        int i = 0;

        try {
            ArrayList<String> list = new ArrayList<>();
            String a = "hello";
            // 不断向 list 中添加对象
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
