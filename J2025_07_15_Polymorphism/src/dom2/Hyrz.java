package dom2;

public class Hyrz extends Game {
    public Hyrz(String IDname, String type) {
        super(IDname, type);
    }


    public void gameStartup(){
        System.out.println(IDname+"：火影忍者启动！！！");
    }

    @Override
    public void printGame() {
        System.out.println("火影忍者！");
    }
}
