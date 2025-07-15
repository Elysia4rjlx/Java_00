package dom2;

public class Game {
    public String IDname;
    public String type;

    public Game(String IDname, String type) {
        this.IDname = IDname;
        this.type = type;
    }

     public void gameStartup() {
        System.out.println(IDname +"启动！！！");
    }

    public void printGame(){
        System.out.println("游戏！");
    }
}
