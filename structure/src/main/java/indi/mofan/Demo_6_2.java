package indi.mofan;


import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @author mofan
 * @date 2025/5/5 21:40
 */
public class Demo_6_2 {

    static int _1GB = 1024 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1GB);
        System.out.println("分配完毕...");
        System.in.read();
        System.out.println("开始释放...");
        byteBuffer = null;
        System.gc();
        System.in.read();
    }
}
