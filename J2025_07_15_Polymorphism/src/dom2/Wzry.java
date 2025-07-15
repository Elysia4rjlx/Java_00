package dom2;

public class Wzry extends Game {
    public Wzry(String IDname, String type) {
        super(IDname, type);
    }
    public void gameStartup(){
        System.out.println(IDname+"：王者荣耀启动！！！");
    }

    @Override
    public void printGame() {
        System.out.println("王者荣耀！");
    }
}
