package indi.mofan;


import java.io.IOException;

/**
 * 运行时添加以下 JVM 参数，禁用指针压缩：
 * -XX:-UseCompressedOops -XX:-UseCompressedClassPointers
 *
 * @author mofan
 * @date 2025/10/5 20:03
 */
public class Demo1_10 {

    public static void test(Animal animal) {
        animal.eat();
        System.out.println(animal);
    }

    public static void main(String[] args) throws IOException {
        test(new Cat());
        test(new Dog());
        System.in.read();
    }

    static abstract class Animal {
        public abstract void eat();

        @Override
        public String toString() {
            return "我是" + this.getClass().getSimpleName();
        }
    }

    static class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println("啃骨头");
        }
    }

    static class Cat extends Animal {
        @Override
        public void eat() {
            System.out.println("吃鱼");
        }
    }
}
