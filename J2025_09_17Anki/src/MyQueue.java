public class MyQueue {
    /**
     * 使用双向链表来模拟实现队列
     */
    static class ListNode {
        int val;
        ListNode prev;
        ListNode next;

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
        }
        last.next = node;
        node.prev = last;
        last = node;
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
            head.next.prev = null;
            head = head.next;

        }
        this.usedSize++;
        return head.val;
    }


    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }


}
