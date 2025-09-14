import java.util.Deque;
import java.util.LinkedList;

//用两个栈来模拟队列
public class MyQueue2 {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public MyQueue2() {
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }else {
            return s2.pop();
        }

    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public void show(){

    }
}
