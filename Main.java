package LinkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Node head = list.addNode(30,null);
        list.addNode(56,head);
        list .addNode(70,head);
        list.printList(head);
    }
}
