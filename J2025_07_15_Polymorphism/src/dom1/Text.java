package dom1;

public class Text {

    public static void main1(String[] args) {
//        Dog dog = new Dog("大黄",8);
//        dog.eat();

        Animal animal_1 = new Dog("大黄", 8);
        //“子类引用”赋给“父类变量”——向上转型
//        animal_1.bark();
//        向上转型后，只能调用父类里声明的方法,丢失子类
        if(animal_1 instanceof Dog){
            Dog dog = (Dog) animal_1;  // 安全向下转型
            dog.bark();
            //向下转型强制转换
        }

    }

    public static void eatFood(Animal animal) {
        animal.eat();
    }
    public static void main2(String[] args) {
        Animal animal_1 = new Dog("大黄", 8);
        Animal animal_2 = new Cat("加菲猫",7);

        eatFood(animal_1);
        eatFood(animal_2);
    }
}

