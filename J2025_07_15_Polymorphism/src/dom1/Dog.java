package dom1;

public class Dog extends Animal{
    public Dog(String name,int age) {
        super(name,age);
    }

    public void bark(){
        System.out.println(name+"正在汪汪汪");
    }
    @Override
    public void eat(){
        System.out.println(name+"正在吃狗粮");
    }

}
