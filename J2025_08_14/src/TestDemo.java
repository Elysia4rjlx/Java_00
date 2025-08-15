public class TestDemo {
    class Food {
    }

    class Fruit extends Food {
    }

    class Apple extends Fruit {
    }

    class Banana extends Fruit {
    }

    static class Plate<T> { // 设置泛型
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.new Food();
        testDemo.new Fruit();
        testDemo.new Apple(); // 正确：通过 TestDemo 的实例创建 Apple 的实例
        testDemo.new Banana(); // 正确：通过 TestDemo 的实例创建 Banana 的实例


        Plate<Apple> plate = new Plate<>();
        plate.setData(testDemo.new Apple());
        fun(plate);

        Plate<Banana> plate2 = new Plate<>();
        plate2.setData(testDemo.new Banana());
        fun(plate2);

    }
    public static void fun(Plate<? extends Fruit> temp) {
        // temp.setData(new Banana()); // error
        // temp.setData(new Apple()); // error
        System.out.println(temp.getData());
    }

}