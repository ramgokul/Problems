package problems.LinkedlistProblems;

public class PairwiseSwap {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

//    public Node swapPair(Node node){
//
//        // Base Case: The list is empty or has only one node
//        if (node == null || node.next == null) {
//            return node;
//        }
//
//        // Store head of list after two nodes
//        Node remaing = node.next.next;
//
//        // Change head
//        Node newhead = node.next;
//
//        // Change next of second node
//        node.next.next = node;
//
//        // Recur for remaining list and change next of head
//        node.next = swapPair(remaing);
//
//        // Return new head of modified list
//        return newhead;
//    }

    public void swapPair2(Node node){
        Node p = node;
        Node new_start = p.next;

        while (true){
            Node q = p.next;
            Node temp = q.next;
            q.next = p;

            if (temp == null || temp.next == null){
                p.next = temp;
                break;
            }

            p.next = temp.next;
            p = temp;
        }
            head = new_start;
//        return new_start;
    }

    public void moveLastElementToFront(Node node){
        Node last = node;
        Node second_last = null;

        while (last.next != null){
            second_last = last;
            last = last.next;
        }

        last.next = head;
        second_last.next = null;


        head = last;
    }

    public void printList(){
        Node n = head;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PairwiseSwap pair = new PairwiseSwap();
        pair.head = new Node(1);
        pair.head.next = new Node(2);
        pair.head.next.next = new Node(3);
        pair.head.next.next.next = new Node(4);
        pair.head.next.next.next.next = new Node(5);
//        pair.printList();
        pair.swapPair2(pair.head);
//        System.out.println("New head : "+n.data);
        pair.printList();
        pair.moveLastElementToFront(pair.head);
        pair.printList();
    }
}
