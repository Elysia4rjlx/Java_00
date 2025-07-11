package elyjah.text;

import elyjah.demo1.Car;
import elyjah.demo1.Computer;
import elyjah.demo1.GameAccount;

import java.util.Scanner;

public class Text {
    public static void main2(String[] args) {
        Computer computer = new Computer();
        computer.screen = "ry";
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }

    public static void main3(String[] args) {
        Computer computer = new Computer();
        computer.screen = "ry";
        computer.setCpu("uuuu");
        System.out.println(computer.getCpu());
    }

    public static void main4(String[] args) {

        Car xiaoHei = new Car();
       //创造了叫小黑的汽车
        Car xiaoHong = new Car();
       //创造了叫小红的汽车

        xiaoHei.brand = "小米";
        xiaoHong.brand = "宝马";
        xiaoHei.run();
        xiaoHong.flameout();
    }

    public static void main5(String[] args) {
//        GameAccount gameAccount = new GameAccount();
//        System.out.println(gameAccount.balance);


//        System.out.println(gameAccount.toString());
    }


    public static void main(String[] args) {

        GameAccount gameAccount = new GameAccount();

//        gameAccount.balance = 100;   禁止直接修改

        // 测试正常存款
        System.out.println("初始余额: " + gameAccount.getBalance());
        // 输出0.0
        gameAccount.deposit(1000.0);
        System.out.println("存款1000后余额: " + gameAccount.getBalance());
        // 预期输出1000.0
        // 测试无效存款（负数）
        gameAccount.deposit(-500.0);
        System.out.println("尝试存款-500后余额: " + gameAccount.getBalance()); // 预期仍为1000.0
        // 测试零存款
        gameAccount.deposit(0.0);
        System.out.println("尝试存款0后余额: " + gameAccount.getBalance()); // 预期仍为1000.0

    }


}

