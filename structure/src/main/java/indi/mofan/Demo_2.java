package indi.mofan;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * 演示元空间内存溢出:java.lang.OutOfMemoryError: Metaspace
 * -XX:MaxMetaspaceSize=10m
 *
 * @author mofan
 * @date 2025/5/3 21:07
 */
public class Demo_2 extends ClassLoader { // 用来加载类的二进制字节码
    public static void main(String[] args) {
        int j = 0;
        try {
            Demo_2 test = new Demo_2();
            for (int i = 0; i < 10000; i++, j++) {
                // ClassWriter 用于生产类的二进制字节码
                ClassWriter cw = new ClassWriter(0);
                // 版本号，public，类名，包名，所属父类，实现的接口
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                // 返回字节码的 byte[]
                byte[] code = cw.toByteArray();
                // 执行类的加载
                test.defineClass("Class" + i, code, 0, code.length);
            }
        } finally {
            System.out.println(j);
        }
    }
}
