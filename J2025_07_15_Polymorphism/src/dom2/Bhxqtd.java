package dom2;

public class Bhxqtd extends Game{
    public Bhxqtd(String IDname, String type) {
        super(IDname, type);
    }

    @Override
    public void gameStartup() {
        System.out.println(IDname+"：崩坏星穹铁道启动！！！");
    }

    @Override
    public void printGame() {
        System.out.println("崩坏星穹铁道！");
    }
}
