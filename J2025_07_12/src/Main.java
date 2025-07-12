public class Main {
    public static void main1(String[] args) {

        BankAccount account = new BankAccount();

        //account.balance = 1000;无法直接访问修改余额
        //account.ower = "坤坤"; 无法直接访问修改户主

        //只能获取账户的基本信息，但是无法获取身份证，也无法进行其它修改
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());
//      System.out.println(account.getIDNumber());

        account.deposit(200);
        //存入：200.0   现有余额：9088.24
        account.deposit(-200);
        //请重新输入！

        account.withdraw(10000);
        //余额不足

        account.withdraw(520);
        //取出：520.0    现有余额：8568.24

    }

    public static void main2(String[] args) {

        Student student = new Student("牢大", 24);
        student.showInfo();

        //  不推荐使用对象名.静态变量名
        //   System.out.println(student.schoolName);
        //  推荐使用类名.静态变量名
        System.out.println(Student.schoolName);

    }


    /* ---------- 演示 main ---------- */
    public static void main3(String[] args) {
        // 静态变量可以直接通过类名访问
        System.out.println("学校名：" + Student.schoolName);

        Student s1 = new Student("牢大", 24);
        s1.showInfo();   // 实例方法必须通过对象调用

        // 静态方法可以通过类名调用
        Student.printSchool();
    }


}



