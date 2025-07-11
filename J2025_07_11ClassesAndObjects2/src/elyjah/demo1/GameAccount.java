package elyjah.demo1;

//public class GameAccount {
//    public  int balance;

//    public GameAccount(){
//        //开局金额默认为0
//    }
//    public GameAccount(int start){
//        //自定义开局金额
//        balance = start;
//    }

//}
//public class GameAccount {
//    public  int balance;
//
//    public GameAccount(){
//        this(1000);
//    }
//    public GameAccount(int start){
//        //自定义开局金额
//        balance = start;
//    }
//
//    @Override
//    public String toString() {
//        return "GameAccount{" +
//                "balance =" + balance +
//                '}';
//    }
//}

public class GameAccount {
    // 1. 私有化敏感属性
    private double balance;

    // 2. 公开getter控制访问
    public double getBalance() {
        return balance;
    }

    // 3. 公开setter添加验证
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
}
