package dom5;


public class Bird extends Animal implements Iflyable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃鸟食......");
    }

    @Override
    public void fying() {
        System.out.println(name+"正在飞......");
    }
}
