package elyjah.demo1;

public class Computer {
    private String cpu;
    private String memory;
    public String screen;
    static String brand;


    {
        this.cpu = "ww";
        this.memory = "eee";
        this.screen = "ry";
        System.out.println("非静态代码块已执行");
    }
    static {
        brand = "华为";
        System.out.println("静态代码块已经执行");
    }
    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }



    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }


//    }
}

