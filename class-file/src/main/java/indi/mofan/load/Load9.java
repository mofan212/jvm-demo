package indi.mofan.load;


/**
 * 懒汉式单例模式，且能够保证线程安全
 *
 * @author mofan
 * @date 2026/1/1 22:20
 */
public class Load9 {
    public static void main(String[] args) {
        Singleton.test();
        System.out.println("---");
        Singleton.getInstance();
    }
}

class Singleton {

    public static void test() {
        System.out.println("test");
    }

    private Singleton() {
    }

    private static class LazyHolder {
        private static final Singleton SINGLETON = new Singleton();

        static {
            System.out.println("lazy holder init");
        }
    }

    public static Singleton getInstance() {
        return LazyHolder.SINGLETON;
    }
}
