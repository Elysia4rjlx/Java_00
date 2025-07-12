public class BankAccount {
    // 1. 关键：用private锁住敏感数据！
    private String owner = "牢大";
    private String IDNumber = "XXXXXXXXXXXXXXXXXX";
    private double balance = 8888.24;

    //2.提供Getter
    public String getOwner() {
        return this.owner;
    }

   //不提供getIDNumber 身份证私密信息
    public double getBalance() {
        return this.balance;
    }

    //3.提供Setter，进行存钱，取钱
    public void deposit(double money) {
        if (money>0){
            balance += money;
            System.out.println("存入：" + money);
            System.out.println("现有余额：" + balance);
        }else {
            System.out.println("请重新输入！");
        }
    }
    public void withdraw(double money){
        if(balance>0&&balance>=money){
            balance-=money;
            System.out.println("取出："+ money);
            System.out.println("现有余额："+ balance);
        }else {
            System.out.println("余额不足");
        }
    }
}
