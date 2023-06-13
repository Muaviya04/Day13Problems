package LinkedList;

public class LinkedList1 {
    private Node head;
    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertAfter(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("prevNode cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }
    public Node search(int key){
        Node current = head;
        while (current!=null){
            if(current.data == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public int size(){
        int count = 0;
        Node current = head;
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList1 LinkedList = new LinkedList1();
        LinkedList.addToFront(70);
        LinkedList.addToFront(30);
        LinkedList.addToFront(56);
        System.out.print("Sequence: ");
        LinkedList.printList();

        LinkedList1 appendList = new LinkedList1();
        appendList.append(56);
        appendList.append(30);
        appendList.append(70);
        System.out.print("appended Sequence: ");
        appendList.printList();

        Node prevNode = appendList.search(56);
        appendList.insertAfter(prevNode,30);
        System.out.print(" inserted Sequence: ");
        appendList.printList();

        appendList.deleteFirst();
        System.out.print("deleted 56 Sequence: ");
        appendList.printList();

        appendList.deleteLast();
        System.out.print("deleted 70 Sequence: ");
        appendList.printList();

        Node node = appendList.search(30);
        System.out.println("node found: "+node.data);

        appendList.insertAfter(node , 40);
        System.out.print("inserted 40 after Sequence: ");
        appendList.printList();

        appendList.deleteFirst();
        System.out.print("Sequence: ");
        appendList.printList();
        System.out.println("LinkedList size: "+appendList.size());

        LinkedList1 sortedList = new LinkedList1();
        sortedList.addToFront(70);
        sortedList.addToFront(40);
        sortedList.addToFront(30);
        sortedList.addToFront(56);
        System.out.print("Final sequence: ");
        sortedList.printList();
    }
}