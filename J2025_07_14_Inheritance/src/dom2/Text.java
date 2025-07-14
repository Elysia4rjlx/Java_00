//package dom2;

//public class Text {
//    public static void main(String[] args) {
//        Derived derived = new Derived();
//        //当我们在构造⼦类对象的时候，需要先调⽤父类构造⽅法，
//        // 然后执⾏⼦类的构造⽅法
//
//        derived.method1();
//        derived.method1(1);
//        //通过是否传参来判断是调到子类还是父类方法
//    }
//}


//public class Text {
//
//    public static void main5(String[] args) {
//        Derived derived = new Derived();
//        derived.method2();
//        System.out.println("");
//
//        derived.method1();//通过子类的supper调动了父类同名的metho1
//    }
//
//
//}
//public class Text {
//
//    public static void main4(String[] args) {
//        Derived derived = new Derived();
//        derived.method1();//父子类方法同名，优先调用子类
//        derived.method2();//子类方法调用
//    }
//}


//public class Text {
//
//    public static void main3(String[] args) {
//        Derived derived = new Derived();
//        derived.method1();//父类方法调用
//        derived.method2();//子类方法调用
//    }
//}

//public class Text {
//
//    public static void main2(String[] args) {
//        Derived derived = new Derived();
//        derived.method();
//    }
//}


//public class Text {
//    public static void main1(String[] args) {
//        Derived derived = new Derived();
//        derived.method();
//
//    }
//}
