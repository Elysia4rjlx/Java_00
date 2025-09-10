import java.util.Arrays;

public class MyStack {
    public int[]elem;
    public int usedSize;

    public MyStack(){
        this.elem = new int[10];
    }

    public void push(int val){
        if (isFull()) {
            this.elem = Arrays.copyOf(elem,2);
        }
        elem[usedSize] = val;
        usedSize++;
    }

    private boolean isFull() {
        return usedSize == elem.length;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int pop = elem[usedSize-1];
        usedSize--;
        return pop;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return elem[usedSize-1];
    }
    private boolean isEmpty() {
        return usedSize == 0;
    }
    public int size(){
        return usedSize;
    }
}
