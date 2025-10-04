package indi.mofan;


/**
 * 从字节码角度分析 a++ 相关题目。
 *
 * @author mofan
 * @date 2025/10/4 20:22
 */
public class Demo1_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + ++a + a--;
        // 11
        System.out.println(a);
        // 34
        System.out.println(b);
    }
}
