package indi.mofan.load;


/**
 * @author mofan
 * @date 2026/1/2 13:03
 */
public class Load5_1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("indi.mofan.load.F");
        System.out.println(clazz.getClassLoader());
    }
}
