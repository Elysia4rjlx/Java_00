package dom5;

public class Frog extends Animal implements ISwinable,IRunable {
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃蚊子......");
    }

    @Override
    public void swimming() {
        System.out.println(name+"正在游泳......");
    }

    @Override
    public void running() {
        System.out.println(name+"正在用他的蛙腿一蹦一跳......");
    }
}
