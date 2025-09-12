import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class V {
    private Queue<Integer> qu1;
    private Queue<Integer> qu2;


    public V() {
        qu1 = new LinkedList();
        qu2 = new LinkedList();
    }

    public void push(int x) {
        if (!qu1.isEmpty()) {
            qu1.offer(x);
        } else if (!qu2.isEmpty()) {
            qu2.offer(x);
        } else {
            qu1.offer(x);
        }
    }

    public int pop() {
        int val = 0;
        if (!qu1.isEmpty()) {
            int size = qu1.size();
            while (size - 1 != 0) {
                qu2.offer(qu1.poll());
                size--;
            }
            val = qu1.poll();
        } else if (!qu2.isEmpty()) {
            int size = qu2.size();
            while (size - 1 != 0) {
                qu1.offer(qu2.poll());
                size--;
            }
            val = qu2.poll();
        }
        return val;

    }

    public int top() {

        if (!qu1.isEmpty()) {
            int size = qu1.size();
            int temp = -1;
            while (size != 0) {
                temp = qu1.poll();
                qu2.offer(temp);
                size--;
            }
            return temp;
        } else if (!qu2.isEmpty()) {
            int size = qu2.size();
            int temp = -1;
            while (size != 0) {
                temp = qu2.poll();
                qu1.offer(temp);
                size--;
            }
            return temp;
        }
        return -1;
    }

    public boolean empty() {
        return qu1.isEmpty() && qu2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */