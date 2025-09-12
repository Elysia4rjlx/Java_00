import java.util.*;

public class Text {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        String s = new String(new char[]{'(', '(', ']', ')'});
        System.out.println(myStack.isValid(s));
        System.out.println(s.length());
    }












    public static void main2(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }

    public static void main1(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //尾插法
        list.add(1);
        list.add(2);
        list.add(3);

        //直接调用方法遍历
        System.out.println(list);
        System.out.println("——————————————————————————————————");

        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        System.out.println("——————————————————————————————————");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("——————————————————————————————————");


        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        System.out.println("——————————————————————————————————");

        ListIterator<Integer> lit2 = list.listIterator(list.size());
        while (lit2.hasNext()) {
            System.out.print(lit2.previous());
        }
        System.out.println();


    }
}
