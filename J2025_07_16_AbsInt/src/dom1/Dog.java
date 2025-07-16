package dom1;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"正在啃骨头......");
    }
}
