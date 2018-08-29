package problems.LinkedlistProblems.circular_linkedlist;

public class SplitListIntoTwoHalves {

    static Node head, head1, head2;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    void split_list(){

        if (head == null){
            return;
        }

        Node fast = head, slow = head;

        while (fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next.next == head){
            fast = fast.next;
        }


        head1 = head;
        Node temp = slow.next;
        slow.next = head1;

        fast.next = temp;
        head2 = temp;

    }

    void printList(Node node){
        Node current = node;

        do {
            System.out.println(current.data);
            current = current.next;
        }while (current != node);
        System.out.println();
    }

    public static void main(String[] args) {
        SplitListIntoTwoHalves sit = new SplitListIntoTwoHalves();
        sit.head = new Node(12);
        sit.head.next = new Node(56);
        sit.head.next.next = new Node(2);
        sit.head.next.next.next = new Node(11);
        sit.head.next.next.next.next = sit.head;
        sit.split_list();
        sit.printList(head1);
        sit.printList(head2);
    }
}
