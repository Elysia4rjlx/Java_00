package dom4;

import java.util.concurrent.Callable;

public class Text {
    public static void main(String[] args) {
        Computer compute = new Computer();
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();

        compute.start();
        compute.useDevice(keyBoard);
        compute.useDevice(mouse);
        compute.gameStart();
        compute.close(keyBoard,mouse);

    }
}
