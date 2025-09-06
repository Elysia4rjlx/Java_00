public class Text {

    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(13);
        mySingleList.addLast(13);
        mySingleList.addLast(12);
        mySingleList.addLast(13);
        mySingleList.addLast(13);
        mySingleList.addLast(14);
        mySingleList.show();
        System.out.println("---------------------------------");

        mySingleList.removeAllKey(13);
        mySingleList.show();
        System.out.println("----------------------------------");
//        mySingleList.clear();
        mySingleList.show();
        mySingleList.reverseList();
        mySingleList.show();

    }















    public static void main1(String[] args) {
        MySingleList myLinkedList = new MySingleList();

//        myLinkedList.addFirst(1);
//        myLinkedList.addFirst(2);
//        myLinkedList.addFirst(3);
//        myLinkedList.addFirst(4);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(4);
//        myLinkedList.addIndex(7,2);
        myLinkedList.show();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(2));
        System.out.println(myLinkedList.contains(8));
        System.out.println("++++++++++++++++++++++++++++++++");
        myLinkedList.remove(2);
        myLinkedList.show();
    }
}
