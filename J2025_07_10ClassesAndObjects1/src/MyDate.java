public class MyDate {
    public int year;
    public int month;
    public int day;

    public void setYear(int year) {
//        year = year;   局部变量优先 这样写会导致左右两边都是局部变量，在方法结束后销毁
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printData() {
        System.out.println("year:" + this.year + " month:" + this.month + " day:" + this.day);
        System.out.println("");
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public MyDate(){
//        this.year = 2025;
//        this.month = 1;
//        this.day = 1;
//    }

    public MyDate() {
        this(1999,9,9);
    }
}
//        this.data
//        访问当前对象的成员变量
//        this.func()
//        访问当前对象的成员方法
//        this()
//        访问当前对象的其他构造方法

