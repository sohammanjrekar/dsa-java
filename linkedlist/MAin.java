package linkedlist;

public class MAin {
    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertEND(42);
        list.insertIndex(100, 3);

        list.display();
        System.out.println(list.deleteFirst());
        System.out.println();
        list.display();
    }
}
