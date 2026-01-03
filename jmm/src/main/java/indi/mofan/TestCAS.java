package indi.mofan;


import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author mofan
 * @date 2026/1/3 20:29
 */
public class TestCAS {
    public static void main(String[] args) throws InterruptedException {
        DataContainer dc = new DataContainer();
        int count = 5;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                dc.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                dc.decrease();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(dc.getData());
    }
}

class DataContainer {

    // data 必须被 volatile 修饰，保证其可见性
    private volatile int data;
    static final Unsafe UNSAFE;
    static final long DATA_OFFSET;

    static {
        try {
            // Unsafe 对象不能直接调用，只能通过反射获得
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            UNSAFE = (Unsafe) theUnsafe.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new Error(e);
        }

        try {
            // data 属性在 DataContainer 对象中的偏移量，用于 Unsafe 直接访问该属性
            DATA_OFFSET = UNSAFE.objectFieldOffset(DataContainer.class.getDeclaredField("data"));
        } catch (NoSuchFieldException e) {
            throw new Error(e);
        }
    }

    public void increase() {
        int oldValue;
        while (true) {
            // 获取共享变量旧值，可以在这一行加入断点，修改 data 进行调试以加深理解
            oldValue = this.data;
            /*
             * cas 尝试修改 data 为「旧值 + 1」，如果修改期间旧值被其他变量改了，则返回 false
             * 流程如下：
             * 1. 通过 this 和 DATA_OFFSET 获取到当前对象中 data 的最新值
             * 2. 使用 data 的最新值与 oldValue 进行比较
             * 3. 如果两者不等，则有其他线程干扰，返回 false，本次修改失败
             * 4. 如果两者相等，则没有其他线程干扰，执行 oldValue + 1 操作，并将结果设置给 data，最终返回 true
             */
            if (UNSAFE.compareAndSwapInt(this, DATA_OFFSET, oldValue, oldValue + 1)) {
                return;
            }
        }
    }

    public void decrease() {
        int oldValue;
        while (true) {
            oldValue = this.data;
            if (UNSAFE.compareAndSwapInt(this, DATA_OFFSET, oldValue, oldValue - 1)) {
                return;
            }
        }
    }

    public int getData() {
        return data;
    }
}