package problems.LinkedlistProblems.circular_linkedlist;

public class IsLLCircular {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    boolean is_circular(){

        if (head == null){
            return true;
        }

        Node current = head;

        while (current.next != null && current.next != head){
            current = current.next;
        }

        return (current.next == head);
    }

    public static void main(String[] args) {
        IsLLCircular sd = new IsLLCircular();
        sd.head = new Node(12);
        sd.head.next = new Node(24);
        sd.head.next.next = new Node(36);

        Boolean is_circ = sd.is_circular();
        System.out.println(is_circ);

        sd.head.next.next.next = sd.head;

        is_circ = sd.is_circular();
        System.out.println(is_circ);
    }
}
