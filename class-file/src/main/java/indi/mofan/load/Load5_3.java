package indi.mofan.load;


/**
 * @author mofan
 * @date 2026/1/2 13:59
 */
public class Load5_3 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Load5_3.class.getClassLoader());
        Class<?> clazz = Load5_3.class.getClassLoader().loadClass("indi.mofan.load.H");
        System.out.println(clazz.getClassLoader());
    }
}
