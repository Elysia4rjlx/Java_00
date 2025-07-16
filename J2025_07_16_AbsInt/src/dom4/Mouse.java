package dom4;

import dom3.IShape;

public class Mouse implements IUSB {
    @Override
    public void openDevice() {
        System.out.println("鼠标正在运行中......");
    }

    @Override
    public void closeDevice() {
        System.out.println("鼠标连接断了......");
    }
    public void move(){
        System.out.println("鼠标移动点击......");
    }
}
