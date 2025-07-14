//package dom2;
//public class Derived extends Base {
//    Derived(){
//        super(10,20);
//        //调动了父类构造方法
//    }
//
//    void method1(int a){
//        System.out.println("子类中的method()⽅法1");
//    }
//    void method2(int a){
//        System.out.println("子类中的method()⽅法2");
//    }
//
//}
//public class Derived5 extends Base {
//
//    int a = 1;
//    int b = 2;
//    int c = 3;
//
//    void method1() {
//        super.method1();
//    }
//
//    void method2() {
//        System.out.println("在子类的方法中调用了父类的成员:"+super.a);
//        System.out.println("在子类的方法中调用了父类的成员:"+super.b);
//        //在子类的方法中调用了父类的成员
//        System.out.println("在子类的方法中调用了子类的成员:"+a);
//        System.out.println("在子类的方法中调用了子类的成员:"+b);
//    }
//}


//public class Derived4 extends Base{
//
//    int b = 20;
//    int c = 30;
//
//    public void method1(){
//        System.out.println("子类方法调用1");
//    }
//    public void method2(){
//        System.out.println("子类方法调用2");
//    }
//通过⼦类对象访问⽗类与⼦类中不同名⽅法时，优先在⼦类中找，找到则访问，否则在⽗类中找，
//找到则访问，否则编译报错
//}
//public class Derived extends Base{
//
//    int b = 20;
//    int c = 30;
//

//    public void method2(){
//        System.out.println("子类方法调用");
//    }
//
//}
//public class Derived2 extends Base {
//    //父类的int a = 10;
//    public int a = 100;
//    public int b = 200;
//    public int c = 300;
//
//    void method() {
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
////      System.out.println("d = " + d);在父类子类中均无定义
//    }
//    //输出为：
//    // a = 100
//    // b = 200
//    // c = 300
//    //如果访问的成员变量⼦类中有，优先访问⾃⼰的成员变量。
//    //
//    //如果访问的成员变量⼦类中⽆，则访问⽗类继承下来的，如果⽗类也没有定义，则编译报错。
//    //
//    //如果访问的成员变量与⽗类中成员变量同名，则优先访问⾃⼰的。
////成员变量访问遵循就近原则，⾃⼰有优先⾃⼰的，如果没有则向⽗类中找。
//
//}
//public class Derived1 extends Base{
//    int b;
//    int c;
//    void method(){
//        a = 10;    //访问从⽗类中继承下来的
//
//        b = 20;    //访问⼦类⾃⼰的
//
//        c = 30;    //访问⼦类⾃⼰的
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println("子类父类无同名变量");
//    }
//
//}
