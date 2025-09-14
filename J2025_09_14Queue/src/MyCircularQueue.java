public class MyCircularQueue {

    public int[]elem;
    public int front;//头
    public int rear;//尾

    public MyCircularQueue(int k) {
        //因为我们要牺牲一个位置来解决空满问题，所以数组实际容量要多一个
        elem = new int[k+1];
    }

    /**
     * 入队
     * @param val
     * @return
     */
    public boolean enQueue(int val){
        if (isFull()){
            return false;
        }
        this.elem[rear] = val;
        rear = (rear + 1) % elem.length;
        return true;
    }
    /**
     * 出队
     * @return
     */
    public boolean deQueue(){
        if (isEmpty()){
            return false;
        }
        front = (front + 1) % elem.length;
        return true;
    }
    /**
     * 获取队头元素
     * @return
     */
    public int Front(){
        if (isEmpty()){
            return -1;
        }
        return elem[front];
    }
    /**
     * 获取队尾元素
     * @return
     */
    public int Rear(){
        if (isEmpty()) {
            return -1;
        }
        int index = (rear == 0) ? elem.length-1 : rear-1;
        return elem[index];
    }
    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return rear == front;
    }
    /**
     * 判断是否为满
     * . 牺牲一个位置，让 (rear+1)%len == front 表示满
     * @return
     */
    public boolean isFull(){
        if ((rear + 1) % elem.length == front){
            return true;
        }
        return false;
    }
    public void show(){
        if (isEmpty()){
            System.out.print("队列为空...");
            return ;
        }
        System.out.println("队列元素为:");
        //计算循环队列中的有效元素
        int size = (rear - front + elem.length) % elem.length;
        //从front位置开始遍历所有
        for (int i = 0; i < size; i++) {
//           i 是一个偏移量，代表 “从队头 front 开始往后数的第 i 个元素”。
//           它的作用是帮助我们依次访问队列中的每个有效元素，从队头一直到队尾
            int index = (front + i) % elem.length;
            System.out.print(elem[index]);
            if (i<size-1){
                System.out.print(",");
            }
        }
        System.out.println("");
    }

}
