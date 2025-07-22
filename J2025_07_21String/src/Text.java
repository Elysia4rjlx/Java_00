import javax.imageio.stream.ImageInputStreamImpl;
import javax.xml.parsers.SAXParser;
import java.util.Locale;

public class Text {
    public static void main1(String[] args) {
        //直接赋值
        String s1 = "hello world";
        //new 一个对象出来
        String s2 = new String("I love Elysia!");
        //使用字符数组进行构造
        char[] array = {'L', 'O', 'V', 'E'};
        String s3 = new String(array);
        //使用字节数组来构造
        byte[] array1 = {97, 98, 99, 100};

//        ASCII编码
        String s4 = new String(array1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public static void main2(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        String s3 = new String("abc");
        System.out.println(s1 == s3);


    }

    public static void main3(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 10;
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
//内置类==比较变量的值
        System.out.println(a==b);
        System.out.println(a==d);
        System.out.println("————————————————————————————————————————————————————————————————————————");
//引用类型比较引用的地址
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }

    public static void main4(String[] args) {
        String s1 = "abcd";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s2.equals(s3));
        //equals⽐较：String对象中的逐个字符
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
        System.out.println(s2.compareTo(s1));

    }

    public static void main5(String[] args) {
        String s1  = "abcdefg";
        char[]chars = s1.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println("");
        for (char c : chars){
            System.out.print(c+" ");
        }
    }

    public static void main6(String[] args) {
        String s1  = "HEllO";
        String s2 = "dasfjsdkjkfhskfjhweui";
        System.out.println(s2.charAt(6));
        System.out.println(s1.indexOf("l"));//输出下标
        System.out.println(s1.indexOf("O", 3));
        System.out.println(s1.indexOf("ll"));//返回子串第一次出现的位置下标（第一个字母）
        System.out.println(s2.indexOf("jk", 2));//从fromlndex位置开始找ch第一次出现的位置
        System.out.println(s2.lastIndexOf("w"));//从后往前找，返回s2 第一次出现的位置，
        System.out.println(s2.lastIndexOf("hw", 3));
        System.out.println(s2.lastIndexOf("da", 3));
        System.out.println("————————————————————");

    }

    public static void main7(String[] args) {
        //数值和字符串的转化。
        //在Java中，valueOf 是一个静态方法，
        //主要用于将其他类型的数据（如基本类型、字符串等）转换为对应的包装类对象或特定类的实例
        String s1 = String.valueOf(1234);
        String s2 = String.valueOf(13.14);
        String s3 = String.valueOf(0.52f);
        String s4 = String.valueOf(true);
        Boolean b = Boolean.valueOf(s4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(b);

        System.out.println("——————————————————————————————————————————————————————————————————");
//        在Java中，Integer.toString(i) 是将整型变量 i 转换为字符串的方法。
//        下面是将字符串转化为对于类型
        int num = Integer.parseInt(s1);
        double num2 = Double.parseDouble(s2);
        float num3 = Float.parseFloat(s3);
        boolean b2 = Boolean.parseBoolean(s4);

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(b2);


    }


    public static void main8(String[] args) {
//        大小写转换
        String s1 = "hello";
        String s2 = "HELLO";

       //小写转大写
        System.out.println(s1.toUpperCase());
       //大写转小写
        System.out.println(s2.toLowerCase());


    }

    public static void main9(String[] args) {
//        字符串转数组
        String s = "hello";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println("");
//        数组转字符串
        String s1 = new String(ch);
        System.out.println(s1);

    }

    public static void main10(String[] args) {
//        字符串的格式化
        String name = "张三";
        int age = 25;
        double score = 89.5;

        //  格式化输出
        String info = String.format("姓名：%s，\n年龄：%d，\n成绩：%.1f分", name, age, score);
        System.out.println(info);
        // 输出：姓名：张三，年龄：25，成绩：89.5分

    }

    public static void main11(String[] args) {
//        字符串替换
        String s1 ="helloworld";
//        replaceAll(替换内容，替换成什么)——全部替换
        System.out.println(s1.replaceAll("l", "_"));
//        replaceFirst(替换内容，替换成什么)——替换首个
        System.out.println(s1.replaceFirst("l", "_"));
    }

    public static void main12(String[] args) {
//        字符串的拆分————split()
        String s = "hello world I love you";
        String[] result = s.split(" ");
        for (String str : result) {
            System.out.println(str);
        }
        System.out.println("");

//        字符串的部分拆分，limit 表示拆成几组
        String[] result2 = s.split(" ", 3);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
        System.out.println("");
//        特殊字符作为分割符 可能无法正确的切分 需要加上转义//
        String s2 = "192.168.1.2";
        String[] strings = s2.split("\\.");
        for (String str : strings){
            System.out.println(str);
        }
        System.out.println("");
//        多次拆分

        String s3 = "name=牢大&age=18";
        String[]strings1 = s3.split("&");
        for (String s1 : strings1){
            System.out.println(s1);
        }
//        for (int i = 0; i < strings1.length; i++) {
//            String[]temp = strings1[i].split("=");
//            System.out.println(temp[0] + "=" + temp[1]);
//        }
    }

    public static void main13(String[] args) {
//        字符串截取
//        substring()方法 输入从哪一个下标开始到结尾，也可以在多加一个截止下标
    String s = "ILOVEYOU";
        System.out.println(s.substring(2));
        System.out.println(s.substring(0,5));

    }

    public static void main14(String[] args) {
//        intern()方法
//        intern 方法可以直接引用堆中的字符串实例，无需再复制。
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = s1.intern();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.intern());

    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;

        sb1.append(" ");
        System.out.println(sb1);
        sb1.append("world");
        System.out.println(sb1);
        sb1.append(" 5201314");
        System.out.println(sb1);
        System.out.println("————————————————————————————————————");
        System.out.println(sb1 == sb2);//true
        System.out.println("————————————————————————————————————");
        System.out.println(sb1.charAt(6));//获取下标6的位置的字符
        System.out.println(sb2.length());//获取字符串的有效长度19
        System.out.println("————————————————————————————————————");
        sb1.setCharAt(0,'H');
        sb1.setCharAt(6,'W');//设置任意位置的字符
        System.out.println(sb1);
        System.out.println("————————————————————————————————————");
        sb1.insert(5,"!!!!");
        System.out.println(sb1);//在某一位置插入“!!!”
        System.out.println("————————————————————————————————————");
        System.out.println(sb1.indexOf("Hello"));//取Hello第一次出现的位置
        System.out.println(sb1.lastIndexOf("!"));//取! 最后一次出现的位置
        System.out.println("————————————————————————————————————");
        sb1.deleteCharAt(0);//删除第一个字母
        System.out.println(sb1);
        sb1.insert(0,'H');
        System.out.println(sb1);
        System.out.println("————————————————————————————————————");
        sb1.delete(0,9);//删除0到9下标的字母
        System.out.println(sb1);
        System.out.println("————————————————————————————————————");
        String str = sb1.substring(6);//截取[6到结尾)区间中的字符以String返回
        System.out.println(str);
        System.out.println("————————————————————————————————————");
        System.out.println(sb1.reverse());//字符串逆转

    }


























}
