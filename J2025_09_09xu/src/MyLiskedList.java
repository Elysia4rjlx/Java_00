public class MyLiskedList {
//双向链表

    //静态内部类
    static class ListNode{
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val) {
            this.val = val;
        }
    }
//  标记头尾节点
    public ListNode head;
    public ListNode last;
    //头插法
    public void addFirst(int data){

        ListNode node = new ListNode(data);

        if (head == null) {
            head = node;
            last = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;

        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            last = node;
        }else{
            node.prev = last;
            last.next = node;
            last = node;
        }

    }
    //任意位置插⼊,第⼀个数据节点为0号下标
    public void addIndex(int index,int data){
        int size = size();
        if(index<0 && index > size){
            System.out.println("下标不正确，请重新输入......");
            return;
        }
//     判断是否插入头或者尾
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = search(index);

        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }

    private ListNode search(int index) {
        ListNode cur = head;
        while (index != 0){
            index--;
            cur = cur.next;
        }
        return cur;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第⼀次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head){
                    //删除头结点
                    head = head.next;
                    if (head == null){
                        //只有一个结点时
                        last = null;
                    }else {
                        head.prev = null;
                    }
                }else {
                    //删除中间与尾部
                    if (cur.next == null) {
                        //尾巴
                        cur.prev.next = cur.next;
                        last = last.prev;
                    }else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
//            Java 的垃圾回收器（GC）判断一个对象是否可回收的标准是：该对象是否还被 “有效引用” 指向。
//            当cur脱离链表后，链表中没有任何节点的指针指向cur（prevNode和nextNode都不再引用cur）；
//            cur自身的next和prev虽然还保留着对nextNode和prevNode的引用，但这是 **cur对象内部的引用 **，
//            不会影响 GC 对cur的回收（GC 只关心 “外部是否有引用指向该对象”，不关心对象内部的引用）。
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head == null) {
                        last = null;
                    }else {
                        head.prev = null;
                    }
                }else {
                    if (cur.next == null) {
                        cur.prev.next = cur.next;
                        last = last.next;
                    }else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }

    }



    //得到双链表的⻓度
    public int size(){
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
    public void show(){
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println("");

    }
    public void clear(){}

}
