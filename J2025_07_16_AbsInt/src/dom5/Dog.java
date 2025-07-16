package dom5;

public class Dog extends Animal implements IRunable{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃肉......");
    }

    @Override
    public void running() {
        System.out.println(name+"正在跑步......");
    }
}
