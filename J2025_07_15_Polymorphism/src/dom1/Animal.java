package dom1;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void eat() {
        System.out.println(name + "正在吃饭......");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉......");
    }


}
