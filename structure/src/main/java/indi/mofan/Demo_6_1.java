package indi.mofan;


import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mofan
 * @date 2025/5/5 21:06
 */
public class Demo_6_1 {
    static int _100MB = 1024 * 1024 * 100;

    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100MB);
                list.add(byteBuffer);
                i++;
            }
        } finally {
            System.out.println(i);
        }
    }
}
