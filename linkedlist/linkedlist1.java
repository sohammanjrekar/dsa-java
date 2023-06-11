package linkedlist;

public class linkedlist1 {
    private Node head;
    private Node tail;
    private int size;

    public linkedlist1() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int Value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
