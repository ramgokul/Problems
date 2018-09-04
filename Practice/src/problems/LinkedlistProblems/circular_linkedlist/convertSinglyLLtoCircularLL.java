package problems.LinkedlistProblems.circular_linkedlist;

public class convertSinglyLLtoCircularLL {

    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    void convert_ll(Node node){
        Node current = node;
        Node start = current;

        while (current.next != null){
            current = current.next;
        }

        current.next = start;
    }

    void is_circ(Node node){
        Node current = node;
        Node ptr = node;
        Boolean is_it_a_circular_ll = false;

        while (ptr.next != current && ptr.next != null){
            ptr = ptr.next;
        }

        is_it_a_circular_ll = (ptr.next == head);
        System.out.println("Circular linked list : "+is_it_a_circular_ll);

    }

    void count_nodes(Node node){
        int count = 1;

        Node current = node;

        while (current.next != head){
            current = current.next;
            count += 1;
        }

        System.out.println("Number of nodes : "+count);
    }

    void swapFirstAndLastNodes(Node node){
        Node p = node;

        while (p.next.next != head){
            p = p.next;
        }

        p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;
    }

    void traverse(Node node){
        Node current = node;

        do {
            System.out.println(current.data);
            current = current.next;
        }while (current != node);
    }


    public static void main(String[] args) {
        convertSinglyLLtoCircularLL cis = new convertSinglyLLtoCircularLL();
        cis.head = new Node(3);
        cis.head.next = new Node(4);
        cis.head.next.next = new Node(5);
        cis.head.next.next.next = new Node(6);
        cis.head.next.next.next.next = cis.head;

        cis.swapFirstAndLastNodes(cis.head);
        cis.traverse(cis.head);

//        cis.is_circ(cis.head);
//        cis.convert_ll(cis.head);
//        cis.is_circ(cis.head);
//        cis.count_nodes(cis.head);
    }
}
