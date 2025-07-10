public class WashMachine {
    //成员属性or类成员变量
    public String brand;
    public String type;
    public double weight;
    public double length;
    public double width;
    public double heigth;
    public String color;

    //成员方法
    public void washClothes() {
        System.out.println("洗衣服");
    }

    public void dryClothes() {
        System.out.println("脱水");
    }

    public void setTime() {
        System.out.println("定时");
    }
}