public class text {

    public static void main23(String[] args) {
        Message<Integer> message = new Message<>();
        message.setMessage(999);
//        fun(message); // 出现错误，只能接收String
        fun1(message);
    }

    private static void fun1(Message<?>temp) {
        System.out.println(temp.getMessage());
    }


    public static void main3(String[] args) {
        Message<String> message = new Message<>();
        message.setMessage("我草拟吗");
        fun(message);
    }

    public static void fun(Message<String> temp){
        System.out.println(temp.getMessage());
    }


















    public static void main2(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();//1
        myArray.setVal(0, 10);
        myArray.setVal(1, 12);
        int ret = (int) myArray.getPos(1);//2
        System.out.println(ret);

//        myArray.setVal(2,"bit");//3
//        myArray.setVal(3,"s");
//        类型检查
    }


//
//    public static void main1(String[] args) {
//        MyArray myArray = new MyArray();
//        myArray.setVal(0, 10);
//        myArray.setVal(1, "hello");//字符串也可以存放
////        String ret = myArray.getPos(1);//编译报错
////        只能强转
//        String ret = (String) myArray.getPos(1);
//
//        System.out.println(ret);
//    }
}
