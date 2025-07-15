package dom2;

public class Text {
    public static void func(Game g) {
        g.gameStartup();
    }

    public static void fun1(Wzry wzry) {
        wzry.gameStartup();
    }//如果没有向上转型，就需要对每一个子类进行编程，
    // 以及在main方法中new


    public static void main1(String[] args) {
        Game person1 = new Wzry("门将", "wzry");
        Game person2 = new Hyrz("门将", "hyrz");
        Game person3 = new Op("门将", "op");
        Wzry person4 = new Wzry("门将", "wzry");
        //父类引用了不同的对象来调动通过方法，方法产生的结果也不同
        // 编译时看左边（父类），运行时看右边（子类）
        func(person1);
        func(person2);
        func(person3);
        System.out.println("————————————————————————");
        fun1(person4);

        func(new Bhxqtd("门将", "wzry"));
        //匿名对象一般使用在使用一次的情况下
    }

    public static void main2(String[] args) {
        Game person1 = new Wzry("门将", "wzry");
        Game person2 = new Hyrz("门将", "hyrz");

        Wzry wzry = (Wzry) person1;
//        Hyrz hyrz = (Hyrz) person1;
//        但是容易出错
        wzry.gameStartup();
        //向下转型
        if (person2 instanceof Hyrz ) {
//         父类引用             子类   用instanceof来判断
            Hyrz hyrz = (Hyrz) person2;
            hyrz.gameStartup();
        } else {
            System.out.println("未知");
        }
    }

    public static void main(String[] args) {
        Game[]gamelist = {new Hyrz("门将", "hyrz"),new Wzry("门将", "wzry"),new Op("门将", "op"),new Bhxqtd("门将", "bhxqtd")};
        for (Game game:gamelist){
            game.printGame();
        }
        for (int i = 0; i < gamelist.length; i++) {
            
        }
    }
}
