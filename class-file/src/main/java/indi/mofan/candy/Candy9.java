package indi.mofan.candy;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author mofan
 * @date 2025/10/7 20:20
 */
public class Candy9 {
    // public static void main(String[] args) {
    //     try (InputStream is = new FileInputStream("d:\\1.txt")) {
    //         System.out.println(is);
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }


    public Candy9() {
    }

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("d:\\1.txt");
            Throwable t = null;
            try {
                System.out.println(is);
            } catch (Throwable e1) {
                // 编写的代码出现异常
                t = e1;
                throw e1;
            } finally {
                // 资源不为空
                if (is != null) {
                    // 编写的代码有异常
                    if (t != null) {
                        try {
                            is.close();
                        } catch (Throwable e2) {
                            // 调用 close() 出现异常，作为被压制异常添加
                            t.addSuppressed(e2);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
