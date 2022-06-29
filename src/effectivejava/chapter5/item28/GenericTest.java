package effectivejava.chapter5.item28;

/**
 * @author caozhixin
 * @date 2022/6/28 14:54
 */
public class GenericTest {
    public static void main(String[] args) {
//        Orchard<Fruit> orchard = new Orchard<Apple>();
//        Orchard<? extends Fruit> orchard = new Orchard<Apple>();
//        orchard.get();
        // <? extends Fruit> 无法知道输入的是Apple或者是Banana，若Banana合法，上面Apple定义就会报错
//        orchard.set(new Apple());
//        orchard.set(new Banana());
//        Orchard<? extends Fruit> orchard2 = new Orchard<Banana>();
//        Shop<Apple> shopA = new Shop<Fruit>();
        // 下面做法，可以限制Banana的输入
//        Shop<? super Apple> shopB = new Shop<Fruit>();
//        shopB.set(new Apple());
//        shopB.set(new RedApple());
//        shopB.get();
//        shopB.set(new Banana());
        // 下面做法，无法限制Banana的输入
//        Shop<Fruit> shopC = new Shop<Fruit>();
//        shopC.set(new Apple());
//        shopC.set(new Banana());
    }

    interface Generator<T> {
        public T next();
    }

    class FruitGenerator<T> implements Generator<T> {
        @Override
        public T next() {
            return null;
        }
    }

    class FruitGenerator2 implements Generator<String> {
        @Override
        public String next() {
            return null;
        }
    }

    static class Orchard<T> {
        T t;
        public void set(T t) {
            this.t = t;
        }
        public T get() {
            return t;
        }
    }

    static class Shop<T> {
        T t;
        public void set(T t) {
            this.t = t;
        }
        public T get() {
            return t;
        }
    }

    static class Fruit {

    }

    static class Apple extends Fruit {

    }

    static class Banana extends Fruit {

    }

    static class RedApple extends Apple {

    }

}
