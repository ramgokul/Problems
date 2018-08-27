package problems.LinkedlistProblems.circular_linkedlist;

public class DeleteNodeFromCircular {

    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    void delete_node(int key){

        if (head == null){
            return;
        }

        Node start = head;
        Node ptr = start;

        if (start.data == key){

            while (ptr.next != start){
                ptr = ptr.next;
            }

            ptr.next = start.next;
            start.next = null;
            head = ptr.next;
            return;
        }

        Node prev = null;

        while (ptr.next != start && ptr.data != key){
            prev = ptr;
            ptr = ptr.next;
        }

        if (ptr.next == start){
            System.out.println("Element not found");
            return;
        }
        prev.next = ptr.next;
    }

    void printList(){
        Node n = head;

        do {
            System.out.println(n.data);
            n = n.next;
        }while (n != head);
        System.out.println();
    }


    public static void main(String[] args) {
        DeleteNodeFromCircular d = new DeleteNodeFromCircular();
        d.head = new Node(5);
        d.head.next = new Node(10);
        d.head.next.next = new Node(15);
        d.head.next.next.next = d.head;
        d.printList();
        d.delete_node(5);
        d.printList();
    }
}
