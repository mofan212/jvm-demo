package indi.mofan.load;


/**
 * @author mofan
 * @date 2026/1/2 13:36
 */
public class Load5_2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("indi.mofan.load.G");
        System.out.println(clazz.getClassLoader());
    }
}
