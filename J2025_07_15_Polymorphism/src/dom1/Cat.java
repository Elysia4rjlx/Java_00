package dom1;

public class Cat extends Animal{
    public Cat(String name,int age) {
        super(name,age);
    }
    public void meow(){
        System.out.println(name+"正在喵喵喵");
    }
    @Override
    public void eat(){
        System.out.println(name+"正在吃猫粮");
    }

}
