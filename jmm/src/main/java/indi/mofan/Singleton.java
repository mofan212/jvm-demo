package indi.mofan;


/**
 * @author mofan
 * @date 2026/1/3 18:17
 */
public final class Singleton {
    private Singleton() {
    }

    private volatile static Singleton INSTANCE = null;

    public static Singleton getInstance() {
        // 实例还没创建，才进入内部的 synchronized 代码块，减少锁的粒度
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                // 也许有其他线程已经创建实例，所以再判断一次
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
