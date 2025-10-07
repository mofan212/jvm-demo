package indi.mofan.candy;


/**
 * @author mofan
 * @date 2026/1/1 19:21
 */
public class Candy9_2 {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class MyResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new Exception("close 异常");
        }
    }
}
