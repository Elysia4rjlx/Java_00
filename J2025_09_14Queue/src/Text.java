public class Text {



    public static void main1(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.show();

        System.out.println("___________________");

        myCircularQueue.deQueue();
        myCircularQueue.show();
        System.out.println("队头元素：" + myCircularQueue.Front());
        System.out.println("队尾元素：" +myCircularQueue.Rear());
    }
}
