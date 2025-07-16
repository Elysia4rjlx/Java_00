package dom1;

public class Text {
    public static void eatFunc(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        Dog dog  = new Dog("大黄",4);
        Bird bird = new Bird("坤坤",4);

        eatFunc(dog);
        eatFunc(bird);
        eatFunc(new Fish("小鲤鱼",3));
    }
}
