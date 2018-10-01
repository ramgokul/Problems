package problems.LinkedlistProblems;

import java.util.HashSet;
import java.util.Set;

public class CountPairsFromTwoLL {
    /*
            Given two linked lists(can be sorted or unsorted) of size n1 and n2 of distinct elements.
            Given a value x. The problem is to count all pairs from both lists whose sum is equal to the given value x.

            Note: The pair has an element from each linked list.

            Examples:



            Input : list1 = 3->1->5->7
                    list2 = 8->2->5->3
                    x = 10
            Output : 2
            The pairs are:
            (5, 5) and (7, 3)

            Input : list1 = 4->3->5->7->11->2->1
                    list2 = 2->3->4->5->6->8-12
                    x = 9
            Output : 5
     */
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        static void count_pairs(Node n1, Node n2, int x){
            Set<Integer> set = new HashSet<>();

            Node current = n1;

            while (current != null){
                set.add(current.data);
                current = current.next;
            }

            current = n2;

            while (current != null){
                if (set.contains(x - current.data)){
                    System.out.println("Pairs are "+current.data+ ", "+(x-current.data));
                }

                current = current.next;
            }
        }

        public static void main(String[] args) {
            CountPairsFromTwoLL c1 = new CountPairsFromTwoLL();
            c1.head = new Node(3);
            c1.head.next = new Node(1);
            c1.head.next.next = new Node(5);
            c1.head.next.next.next = new Node(7);

            CountPairsFromTwoLL c2 = new CountPairsFromTwoLL();
            c2.head = new Node(8);
            c2.head.next = new Node(2);
            c2.head.next.next = new Node(5);
            c2.head.next.next.next = new Node(3);

            count_pairs(c1.head, c2.head, 10);

        }
    }
}
