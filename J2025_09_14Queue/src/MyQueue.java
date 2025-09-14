/**
 * 使用双向链表来模拟实现队列
 */
public class MyQueue {
    static class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode last;

    public int usedSize;

    public void offer(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        this.usedSize++;
    }


    public int poll() {
        if (head == null) {
            return -1;
        }
        int val = head.val;
        if (head.next == null) {
            head = null;
            last = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        this.usedSize++;
        return val;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    public int size() {
        return this.usedSize;
    }
}
