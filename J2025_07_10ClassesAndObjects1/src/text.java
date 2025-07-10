public class text {


    public static void main1(String[] args) {
        //类的实例化 使用关键词new
        Dog dog1 = new Dog();
        dog1.age = 9;
        dog1.name = "旺财";
        dog1.brand = "金毛";

        dog1.bark();
        dog1.eat();
    }

    public static void main(String[] args) {
//        MyDate date = new MyDate(2025,06,3);
        MyDate date = new MyDate();
        date.printData();
//        date.setDate(2025, 07, 10);
        System.out.println(date);

    }

    public static void main3(String[] args) {

    }

}
