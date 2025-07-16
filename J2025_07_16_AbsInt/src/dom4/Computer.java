package dom4;

public class Computer {

    public void close(IUSB usb1,IUSB usb2) {
        System.out.println("电脑正在关机......");
        System.out.println(".....................");
        closeDevice(usb1);
        closeDevice(usb2);
        System.out.println("关机成功！！！");
        System.out.println("");
    }


    public void start() {
        System.out.println("电脑正在开机......");
        System.out.println(".....................");
        System.out.println("开机成功！！");
        System.out.println("");
    }

    public void gameStart() {
        System.out.println("开始游戏......");
        System.out.println(".....................");
        System.out.println("");
        System.out.println("");
    }

    public void useDevice(IUSB usb) {
        usb.openDevice();
        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.input();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.move();
        }
    }

    public void closeDevice(IUSB usb) {
        usb.closeDevice();
    }
}
