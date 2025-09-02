public class Text {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}
