package dom5;

public class Fish extends Animal implements ISwinable{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "正在吃鱼食......");
    }

    @Override
    public void swimming() {
        System.out.println(name+"正在游泳......");
    }
}
