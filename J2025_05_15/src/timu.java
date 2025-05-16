import java.util.Random;
import java.util.Scanner;

public class TEXT {
    public static void main(String[] args) {
//        任务是打印用“*”组成的X形图案。
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) {
//            in.hasNextInt() 是 Java 中 Scanner 类的一个方法，
//            用于检查输入流中是否还有下一个整数可以读取。
            int n = in.nextInt();
//            in.nextInt()表示读取键盘的数据

            for(int i = 0; i< n;i++){

                for( int j = 0;j< n;j++){
                    if(i == j|| i + j == n - 1){
                        System.out.printf("*");
                    }else{
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    
    
    
    
    public static void main5(String[] args) {
        //猜数字
        Random random = new Random();
        int num = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        while (true){
            int i = scanner.nextInt();
            if (i>num){
                System.out.println("猜大了");

            }else if(i == num){
                System.out.println("猜对了");

            }else {
                System.out.println("猜小了");
            }


        }
    }

    public static void main3(String[] args) {

        System.out.println(fun(1724));

    }
public static int fun(int n){
        if(n/10==0){
            return n;
        }
        return n%10 + fun(n/10);
}

    public static void main4(String[] args) {
//    猜数字
        Random random = new Random();
        int num = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
       System.out.println("请输入数字");
        while (true){
            int i = scan.nextInt();
            if (i>num){
                System.out.println("猜大了");
            }else if (i==num){
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("猜小了");
            }
        }
    }




    public static void main1(String[] args) {
        //        计算1/1  -1/2  +1/3  -  1/4  +   1/5 …… + 1/99 - 1/100 的值
        double sum = 0.0;
        int f = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i * f;
            f = -f;
        }
        System.out.println(sum);
    }
}
