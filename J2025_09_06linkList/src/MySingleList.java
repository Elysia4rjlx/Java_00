import java.util.List;

public class MySingleList {

    static class ListNode {
        public int val;//值域
        public ListNode next;//指针域

        public ListNode(int val) {
            this.val = val;
        }
    }


    //标记头
    public ListNode head;


    //头插法
    //
    //

    /**本质上是修改指向
     * 链表的插入一定要先绑定后面
     * @param data
     */
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = head;
        if (head == null) {
            head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插⼊,第⼀个数据节点为0号下标
    public void addIndex(int index, int data) {
        int len = size();
        if (index < 0 || index > len) {
            throw new IndexOutOfBoundsException("索引无效");
        }
        //插入第一个位置
        if (index == 0) {
            addFirst(data);
            return;
        }
        //插入最后一个位置
        if (index == len) {
            addLast(data);
            return;
        }
        //插入中间
        ListNode cur = searchIndex(index);
        if (cur == null) {
            return;
        }
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;


    }

    /**
     * 找到index位置的前一个节点
     *
     * @param index
     * @return
     */
    private ListNode searchIndex(int index) {
        int len = size();
        if (index < 0 || index > len) {
            return null;
        }
        ListNode cur = head;
        int count = 0;
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
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
    public void remove(int key) {
        if (head == null) {
            return;
        }
        if (head.val == key) {
            head = head.next;
            return;
        }
        ListNode prev = findNodePrev(key);
        if (prev == null) {
            return;
        }
        prev.next = prev.next.next;
    }

    /**
     * 查找关键字Key的前驱节点，找到返回地址
     * 找不到返回null
     *
     * @param key
     * @return
     */
    private ListNode findNodePrev(int key) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }


    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.val == key) {
            head = head.next;
        }

    }
    //翻转链表
    public ListNode reverseList(){
        if(head == null){
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = head;
            head = cur;
            cur = temp;
        }
        return head;
    }


    //得到单链表的⻓度
    public int size() {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void clear() {
        this.head = null;
    }

    public void show() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println("");
    }

}
