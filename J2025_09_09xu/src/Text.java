public class Text {
    public static void main(String[] args) {
        MyLiskedList my = new MyLiskedList();
        my.addLast(1);
        my.addLast(2);
        my.addLast(3);
        my.addLast(4);

        my.show();

        my.addIndex(2, 1314);
        my.show();
        System.out.println(my.contains(1314));
        my.remove(1314);
        my.show();

        my.addLast(5);
        my.addLast(5);
        my.addLast(5);
        my.addLast(5);
        my.show();
        System.out.println("___________________________");

        my.removeAllKey(5);
        my.show();


    }
}
