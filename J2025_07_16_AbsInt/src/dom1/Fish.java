package dom1;

public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃鱼食......");
    }
}
