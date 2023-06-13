package LinkedList;

public class Linkedlist {
    public Node addNode(int data , Node head){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return head;
        }
        else {
            Node temp = head;

            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next= newNode;
            return head;
        }
    }
    public void printList(Node head){
        if (head == null){
            System.out.println("Given list is empty");
        }
        else{
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
        }
    }
}
