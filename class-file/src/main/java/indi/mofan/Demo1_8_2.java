package indi.mofan;


import com.sun.org.apache.bcel.internal.classfile.LineNumberTable;
import com.sun.org.apache.bcel.internal.classfile.LocalVariableTable;

/**
 * @author mofan
 * @date 2025/10/5 14:07
 */
public class Demo1_8_2 {

    private String a = "s1";

    {
        b = 20;
    }

    private int b = 10;

    {
        a = "s2";
    }

    public Demo1_8_2(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Demo1_8_2 obj = new Demo1_8_2("s3", 30);
        // s3
        System.out.println(obj.a);
        // 30
        System.out.println(obj.b);
    }
}
