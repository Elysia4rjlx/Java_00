package dom2;

public class Op extends Game{
    public Op(String IDname, String type) {
        super(IDname, type);
    }
    public void gameStartup(){
        System.out.println(IDname+"：原神启动！！！");
    }

    @Override
    public void printGame() {
        System.out.println("原神！！");
    }
}
