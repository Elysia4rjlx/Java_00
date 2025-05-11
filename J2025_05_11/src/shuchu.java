<<<<<<< HEAD
import javax.print.DocFlavor;

public class shuchu {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 5201314L;
        float e = 5.2f;
        double f = 13.14;

        char g = 'A';
        char g1 = '蔡';
        boolean h = (a ==10);

        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(b);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(c);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(d);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(g1);
        System.out.println(h);

        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main1(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main2(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main3(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main4(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main5(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main6(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main7(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main8(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

    }
    public static void main1(String[] args) {
        int a = 250;
        long b = 2500;
        System.out.println("赋值前:"+a);
        System.out.println("赋值前:"+b);

        b = a;
        //将int 类型转换为long类型
        System.out.printf("赋值前: a=%d%n", a);
        System.out.printf("赋值前: b=%d%n", b);
        //两种表达方法，一种是printf和%d，另一种就是println和+

    }

    public static void main2(String[] args) {
        int a = 6;
        long b = 666L;
        float c = 5.2f;
        double d = 131.40;
        System.out.println("赋值前:"+a);
        System.out.println("赋值前:"+b);
        System.out.println("赋值前:"+c);
        System.out.println("赋值前:"+d);
        a = (int) b;
        c = (float) d;
        //这里大变小需要强制转换才能转换，而小转大则不用
        System.out.printf("赋值后: a=%d%n", a);
        System.out.printf("赋值后: b=%d%n", b);
        System.out.printf("赋值后:c=%1f%n", c);
//        这里记得不能用%d
        System.out.printf("赋值后:: d=%2f%n", d);

    }

    public static void main3(String[] args) {
        //不同数据的运算
        int a = 24;
        long b = 88L;
        byte c = 1;
        byte d = 2;

        System.out.println("运算前:"+a);
        System.out.println("运算前:"+b);
        System.out.println("运算前:"+c);
        System.out.println("运算前:"+d);


        long e = a + b;
        byte f = (byte)  (c + d);
        int g = (c + d);
        //这里不能用int e 来接收a+b，会造成编译错误
        //虽然c和f都是byte,但是计算c+d，先将c和d都提升成int,再进⾏计算,得到的结果也是int,这是赋给e
        //计算机的CPU通常是按照4个字节为单位读取，所以像byte和short这两个低于4个字节的都会先转换为int
        System.out.println("运算后:"+e);
        System.out.println("运算后:"+f);
        System.out.println("运算后:"+g);

    }

    public static void main4(String[] args) {
     //字符串与int转换
        int a = 10;
        String STR = a + "";
        String STR1 = String.valueOf(a);

        String str = "250";
        int b = Integer.parseInt(str);
        System.out.println(STR);
        System.out.println(STR1);
        System.out.println(b);
    }

    public static void main5(String[] args) {
    //加减乘除摸
        int a = 10;
        int b = 5;
        double c = 2.0;
        double d = 11.0;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(c / b);
        System.out.println(d % b);
    }

    public static void main6(String[] args) {
        //自增自减
        int a = 6;
        System.out.println(a);
        System.out.println(++a);
//        先加后用
        System.out.println(a++);
//        先用后加

    }

    public static void main7(String[] args) {
//        关系运算
        int a = 520;
        int b = 1314;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        //只会输出true或者false
    }

    public static void main8(String[] args) {
//        逻辑运算，结果为布尔
        int a = 24;
        int b = 8;

        System.out.println( a > b && a == 24);
        System.out.println( a > b && b == 1);
        System.out.println( b < a || b == 8);
        System.out.println( b > a || a == 0);
    }
}

=======
import javax.print.DocFlavor;

public class shuchu {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 5201314L;
        float e = 5.2f;
        double f = 13.14;

        char g = 'A';
        char g1 = '蔡';
        boolean h = (a ==10);

        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(b);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(c);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(d);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(g1);
        System.out.println(h);

        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main1(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main2(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main3(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main4(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main5(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main6(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main7(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

        main8(args);
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");
        System.out.println("——————————————————————————————");

    }
    public static void main1(String[] args) {
        int a = 250;
        long b = 2500;
        System.out.println("赋值前:"+a);
        System.out.println("赋值前:"+b);

        b = a;
        //将int 类型转换为long类型
        System.out.printf("赋值前: a=%d%n", a);
        System.out.printf("赋值前: b=%d%n", b);
        //两种表达方法，一种是printf和%d，另一种就是println和+

    }

    public static void main2(String[] args) {
        int a = 6;
        long b = 666L;
        float c = 5.2f;
        double d = 131.40;
        System.out.println("赋值前:"+a);
        System.out.println("赋值前:"+b);
        System.out.println("赋值前:"+c);
        System.out.println("赋值前:"+d);
        a = (int) b;
        c = (float) d;
        //这里大变小需要强制转换才能转换，而小转大则不用
        System.out.printf("赋值后: a=%d%n", a);
        System.out.printf("赋值后: b=%d%n", b);
        System.out.printf("赋值后:c=%1f%n", c);
//        这里记得不能用%d
        System.out.printf("赋值后:: d=%2f%n", d);

    }

    public static void main3(String[] args) {
        //不同数据的运算
        int a = 24;
        long b = 88L;
        byte c = 1;
        byte d = 2;

        System.out.println("运算前:"+a);
        System.out.println("运算前:"+b);
        System.out.println("运算前:"+c);
        System.out.println("运算前:"+d);


        long e = a + b;
        byte f = (byte)  (c + d);
        int g = (c + d);
        //这里不能用int e 来接收a+b，会造成编译错误
        //虽然c和f都是byte,但是计算c+d，先将c和d都提升成int,再进⾏计算,得到的结果也是int,这是赋给e
        //计算机的CPU通常是按照4个字节为单位读取，所以像byte和short这两个低于4个字节的都会先转换为int
        System.out.println("运算后:"+e);
        System.out.println("运算后:"+f);
        System.out.println("运算后:"+g);

    }

    public static void main4(String[] args) {
     //字符串与int转换
        int a = 10;
        String STR = a + "";
        String STR1 = String.valueOf(a);

        String str = "250";
        int b = Integer.parseInt(str);
        System.out.println(STR);
        System.out.println(STR1);
        System.out.println(b);
    }

    public static void main5(String[] args) {
    //加减乘除摸
        int a = 10;
        int b = 5;
        double c = 2.0;
        double d = 11.0;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(c / b);
        System.out.println(d % b);
    }

    public static void main6(String[] args) {
        //自增自减
        int a = 6;
        System.out.println(a);
        System.out.println(++a);
//        先加后用
        System.out.println(a++);
//        先用后加

    }

    public static void main7(String[] args) {
//        关系运算
        int a = 520;
        int b = 1314;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        //只会输出true或者false
    }

    public static void main8(String[] args) {
//        逻辑运算，结果为布尔
        int a = 24;
        int b = 8;

        System.out.println( a > b && a == 24);
        System.out.println( a > b && b == 1);
        System.out.println( b < a || b == 8);
        System.out.println( b > a || a == 0);
    }
}

>>>>>>> 035ac3471522b8b90705918d234b64dba78ee2ac
