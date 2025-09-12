import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public int[] elem;
    public int usedSize;

    public MyStack() {
        this.elem = new int[2];
    }

    public void push(int val) {
        if (isFull()) {
            this.elem = Arrays.copyOf(elem, 2 * elem.length);
        }
        elem[usedSize] = val;
        usedSize++;
    }

    private boolean isFull() {
        return usedSize == elem.length;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int temp = elem[usedSize - 1];
        usedSize--;
        return temp;
    }

    private boolean isEmpty() {
        return usedSize == 0;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return elem[usedSize - 1];
    }

    public int size() {
        return elem.length;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //1、将左括号压入栈中
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                //2、如果不是左括号就判断能不能匹配到对应右括号
                if (stack.empty()) {
                    return false;
                }
                char c1 = stack.peek();
                if (c1 == '(' && c == ')' || c1 == '[' && c == ']'
                        || c1 == '{' && c == '}') {
                    //3、匹配上就出栈
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }


}
