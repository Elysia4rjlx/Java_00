package dom4;

public class KeyBoard implements IUSB {
    @Override
    public void openDevice() {
        System.out.println("键盘正在打开......");
    }

    @Override
    public void closeDevice() {
        System.out.println("键盘正在关闭......");
    }
    public void  input(){
        System.out.println("键盘正在输入......");
    }
}
