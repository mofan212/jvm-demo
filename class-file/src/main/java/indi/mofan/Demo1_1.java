package indi.mofan;


/**
 * 演示字节码指令和操作数栈、常量池的关系
 *
 * @author mofan
 * @date 2025/10/4 15:39
 */
public class Demo1_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = Short.MAX_VALUE + 1;
        int c = a + b;
        System.out.println(c);
    }
}
