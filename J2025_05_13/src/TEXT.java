public class TEXT {
    public static void main(String[] args) {
//        求出0～n之间的所有“水仙花数”并输出。
//        (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
//        如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
        for (int i = 100; i <= 999; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int num = temp % 10;
                sum += Math.pow(temp % 10, 3);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }


    public static void main7(String[] args) {
        //        计算1/1  -1/2  +1/3  -  1/4  +   1/5 …… + 1/99 - 1/100 的值
        double sum = 0;
        for (double i = 1.0; i <= 100.0; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        System.out.println(sum);

    }

    public static void main6(String[] args) {
//        计算1/1  -1/2  +1/3  -  1/4  +   1/5 …… + 1/99 - 1/100 的值    。
        double n = 1.0;
        double sum1 = 0;
        double sum2 = 0;
        double sum = 0;
        for (double i = 1.0; i <= 99.0; i += 2.0) {
            double num1 = n / i;
            sum1 += num1;
        }
        for (double j = 2.0; j <= 100.0; j += 2.0) {
            double num2 = -(n / j);
            sum2 += num2;
        }
        sum = (sum1 + sum2);
        System.out.println(sum);
    }

    public static void main5(String[] args) {
        // 给定两个数，求这两个数的最大公约数
        // 两个数的最大公约数等于其中较小数和两数相除余数的最大公约数。
        // 例如：
        // 输入：20 40
        // 输出：20
        // 如果大数可以整除小数，那么最大公约数为小数。
        // 如果不能整除小数，那么这两个数就按大到小依次对比小数小的数求余，遇到都能够整除的，就是最大公约数。

        int a = 20; // 假设a是较小的数
        int b = 40; // 假设b是较大的数

        // 使用暴力穷举法找到最大公约数
        for (int n = Math.min(a, b); n >= 1; n--) { // 从较小的数开始向下检查
            if (a % n == 0 && b % n == 0) { // 如果n能同时整除a和b
                System.out.println(n); // 输出最大公约数
                break; // 找到后退出循环
            }
        }
    }


    public static void main4(String[] args) {
        // 给定两个数，求这两个数的最大公约数
        // 两个数的最大公约数等于其中较小数和两数相除余数的最大公约数。
        // 例如:
        // 输入：20 40
        // 输出：20

        int a = 20;
        int b = 40;
        int temp = 0;
        while (a % b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(temp);
    }


    public static void main3(String[] args) {
        int count = 0;
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9    
        for (int i = 1; i <= 100; i++) {
            int temp = i;
            while (temp != 0) {

                if (temp % 10 == 9) {
                    count++;
                }
                temp /= 10;
            }
        }
        System.out.println(count + " ");
    }


    public static void main2(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        for (int i = 1000; i < 2000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main1(String[] args) {
        //打印 1 - 100 之间所有的素数
        System.out.println("1到100之间的素数有：");
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
