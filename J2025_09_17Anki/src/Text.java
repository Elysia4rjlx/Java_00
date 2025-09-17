public class Text {
    //编程求 1~10000 之间的所有“完全数”，完全数是该数的所有因子之和等于该数的数。
    //例如，6 的因子有 1、2、3，且 6=1+2+3，所以 6 是完全数。
    public static void main1(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int n = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0){
                    n = n + j;
                }
            }
            if ( n == i){
                System.out.println(i);
            }
        }
    }
    public static boolean perfectNumber(int num ){
        int sum=0;
//判断一个整数是不是一个完全数
        for(int x = num-1;x >= 1;x--){
            if(num % x == 0){
                sum += x;
            }
        }
        return sum==num;
    }
    public static void main2(String[] args) {
        for(int i=1;i<=10000;i++){
            if(perfectNumber(i)){
                System.out.println(i);
            }
        }
    }
}
