package dom5;

public class Text {
    public static void eatFunc(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        Dog dog = new Dog("牢大",3);
        Fish fish = new Fish("小鲤鱼",4);
        Bird bird = new Bird("坤坤",6);
        Frog frog = new Frog("青蛙",2);

        eatFunc(dog);
        dog.running();
        System.out.println("");
        eatFunc(frog);
        frog.running();
        frog.swimming();
        System.out.println("");
        bird.fying();
        fish.swimming();
    }
}
