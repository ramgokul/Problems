package problems.arrays.rough;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedListPractice {

    Node head;
    Node headA, headB;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    void countOccurence(Node node, int key){
        Node current = node;
        Map<Integer, Integer> map = new HashMap<>();

        while (current != null){
            map.put(current.data, map.getOrDefault(current.data, 0)+1);
            current = current.next;
        }

        List<Integer> count = map.entrySet().stream().filter(x -> x.getKey() == 1).map(x -> x.getValue()).collect(Collectors.toList());

        System.out.println("Occurence = "+count.get(0));
    }

    void swapNodes(Node node, int a, int b){
        Node p = node;
        Node prev = null;

        while (p != null && p.data != a){
            prev = p;
            p = p.next;
        }

        Node pX = p;
        Node prevX = prev;

        p = node;
        prev = null;

        while (p != null && p.data != b){
            prev = p;
            p = p.next;
        }

        Node pY = p;
        Node prevY = prev;

        Node temp = pY.next;
        pY.next = pX.next;
        pX.next = temp;

        if (prevX == null){
            head = pY;
            prevY.next = pX;
        }

        if (prevY == null){
            head = pX;
            prevX.next = pY;
        }

        if (prevX != null && prevY != null){
            prevX.next = pY;
            prevY.next = pX;
        }



    }


    Node reverseLinkedList(Node node){
        Node prev = null, next = null, current = node;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    boolean compareLists(Node n1, Node n2){
        Node node1 = n1, node2 = n2;

        if (node1 == null && node2 == null){
            return true;
        }

        while (node1 != null && node2 != null){
            if (node1.data != node2.data){
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return true;
    }


    void isPalindrome(Node node){
        Node p = node, q = node, new_s = null;

        while (true){
            q = q.next.next;

            if (q != null && q.next == null){
                new_s = p.next.next;
                break;
            }

            if (q == null){
                new_s = p.next;
                break;
            }
            p = p.next;
        }

        p.next = null;

        Node rev_s = reverseLinkedList(new_s);
        Boolean b = compareLists(node, rev_s);

        if (b){
            System.out.println("Its a palindrome");
        }else {
            System.out.println("Its not a palindrome");
        }
    }


    Node reverseALinkedListInGroups(Node node, int k){
        Node current = node, prev = null, next = null;
        int count = 0;

        while (count < k && current != null){
            next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
        }

        if (next != null){
            node.next = reverseALinkedListInGroups(next, k);
        }

        return prev;

//        }
    }


    void alternatingSplit(Node node){
        Node current = node;
        headA = current;
        headB = current.next;

        while (current != null && current.next != null){

            Node nxt = current.next;
            current.next = nxt.next;

            if (nxt != null && nxt.next != null){
                nxt.next = nxt.next.next;
            }

            current = current.next;
        }
    }


    Node reverse(Node node){
        Node current = node, prev = null, next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    Node deleteNodesWithGr8erValOnRightSide(Node node){

        Node new_node = reverse(node);

        Node current = new_node;
        Node maxNode = current;

        while (current != null && current.next != null){

            if (current.next.data < maxNode.data) {
//                Node temp = current.next;
//                current.next = temp.next;
//                temp = null;
                deleteNode(current, current.next);
            }else {
                current = current.next;
                maxNode = current;
            }
        }

        Node new_new_node = reverse(new_node);
        return new_new_node;
    }

    void deleteNode(Node node, Node delete_node){

        if (delete_node == head){

            if (node.next == null){
                System.out.println("There is only one element in the list");
                return;
            }

            head = head.next; //Changed head
            return;
        }

        Node current = node, prev = null;

        while (current != null && current != delete_node){
            prev = current;
            current = current.next;
        }

        if (current == null){
            System.out.println("Node not found");
            return;
        }

        prev.next = current.next;
    }


    void add_Numbers(Node first, Node second){
        int num1 = 0, num2 = 0;

        while (first != null){
            num1 = num1 * 10 + first.data;
            first = first.next;
        }

        while (second != null){
            num2 = num2 * 10 + second.data;
            second = second.next;
        }

        System.out.println("Sum : "+ (num1 + num2));
        System.out.println("Product : "+ (num1 * num2));
    }

    void sortZeroesOnesTwos(Node node){
        Node current = node;
        Map<Integer, Integer> map = new HashMap<>();

        while (current != null){
            map.put(current.data, map.getOrDefault(current.data, 0)+1);
            current = current.next;
        }

        System.out.println(map);

        current = node;

        for (Map.Entry<Integer, Integer> data : map.entrySet()){
            int key = data.getKey();
            int val = data.getValue();

            while (val > 0){
                current.data = key;
                val--;
                current = current.next;
            }
        }
    }

    void deleteNnodesAfterMnodes(Node node, int m, int n){
        Node current = node;

        while (current != null){
            int counter = 1;

            while (current != null && counter < m){
                current = current.next;
                counter++;
            }

            counter = 1;

            Node temp = current.next;
            while (temp != null && counter < n){
                temp = temp.next;
                counter++;
            }

            if (temp == null){
                current.next = temp;
                return;
            }
            current.next = temp.next;
            current = temp.next;
        }
    }

    /*
        Given a singly linked list L0 -> L1 -> … -> Ln-1 -> Ln. Rearrange the nodes in the list so that the new formed list is : L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 …
        You are required to do this in-place without altering the nodes’ values.
        Exam
        ples:

        Input:  1 -> 2 -> 3 -> 4
        Output: 1 -> 4 -> 2 -> 3

        Input:  1 -> 2 -> 3 -> 4 -> 5
        Output: 1 -> 5 -> 2 -> 4 -> 3

        Efficient Solution:

        1) Find the middle point using tortoise and hare method.
        2) Split the linked list into two halves using found middle point in step 1.
        3) Reverse the second half.
        4) Do alternate merge of first and second halves.
     */

    void reArrangeALinkedListInPlace(Node node){
            Node slow = node, fast = slow;

            while (slow != null && fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            Node node1 = node;
            Node node2 = slow.next;

            slow.next = null;

            Node node3 = reverse(node2);

            Node dummy = new Node(0);
            Node current = dummy;

            while (node1 != null || node3 != null){

                if (node1 != null){
                    current.next = node1;
                    current = current.next;
                    node1 = node1.next;
                }

                if (node3 != null){
                    current.next = node3;
                    current = current.next;
                    node3 = node3.next;
                }
            }

            dummy = dummy.next;

    }

    void zigZag(Node node){
        Node current = node;
        Boolean flag = true;

        while (current.next != null){

            if (flag){

                if (current.data > current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }

            }else {

                if (current.data < current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }

            current = current.next;
            flag = !flag;
        }
    }

    void getNode(Node node, int n){
        Node current = node;
        int len = 0;

        while (current != null){
            current = current.next;
            len++;
        }

        System.out.println("len : "+len);

        current = node;

        for (int i=1; i<len-n; i++){
            current = current.next;
        }

        System.out.println("Node data : "+current.data);
    }

    public void printList(Node node){
        Node n = node;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();


    }




    public static void main(String[] args) {
        LinkedListPractice llp = new LinkedListPractice();
//        llp.head = new Node(1);
//        llp.head.next = new Node(2);
//        llp.head.next.next = new Node(3);
//        llp.head.next.next.next = new Node(4);
//        llp.head.next.next.next.next = new Node(5);
//        llp.head.next.next.next.next.next = new Node(6);
//        llp.head.next.next.next.next.next.next = new Node(7);
//        llp.head.next.next.next.next.next.next.next = new Node(8);
//        llp.head.next.next.next.next.next.next.next.next = new Node(9);
//        llp.head.next.next.next.next.next.next.next.next.next = new Node(10);

        llp.head = new Node(1);
        llp.head.next = new Node(2);
        llp.head.next.next = new Node(3);
        llp.head.next.next.next = new Node(4);
        llp.head.next.next.next.next = new Node(5);

//        llp.head = new Node(0);
//        llp.head.next = new Node(1);
//        llp.head.next.next = new Node(0);
//        llp.head.next.next.next = new Node(1);
//        llp.head.next.next.next.next = new Node(0);
//        llp.head.next.next.next.next.next = new Node(1);

//        llp.head = new Node(12);
//        llp.head.next = new Node(15);
//        llp.head.next.next = new Node(10);
//        llp.head.next.next.next = new Node(11);
//        llp.head.next.next.next.next = new Node(5);
//        llp.head.next.next.next.next.next = new Node(6);
//        llp.head.next.next.next.next.next.next = new Node(2);
//        llp.head.next.next.next.next.next.next.next = new Node(3);

//        LinkedListPractice lp1 = new LinkedListPractice();
//        lp1.head = new Node(7);
//        lp1.head.next = new Node(5);
//
//        LinkedListPractice lp2 = new LinkedListPractice();
//        lp2.head = new Node(5);
//
//        lp1.add_Numbers(lp1.head, lp2.head);

        llp.printList(llp.head);
        llp.getNode(llp.head, 4);
//        llp.zigZag(llp.head);
//        llp.reArrangeALinkedListInPlace(llp.head);
//        llp.deleteNnodesAfterMnodes(llp.head, 1, 1);
//        llp.printList(llp.head);
//          llp.sortZeroesOnesTwos(llp.head);

//        llp.countOccurence(llp.head, 1);
//        llp.printList(llp.head);
//        llp.deleteNode(llp.head, llp.head.next.next.next);
//        llp.printList(llp.head);
//        Node s = llp.deleteNodesWithGr8erValOnRightSide(llp.head);
//        llp.printList(s);
//        Node s = llp.reverseALinkedListInGroups(llp.head, 3);
//        llp.alternatingSplit(llp.head);
//        llp.printList(llp.headA);
//        llp.printList(s);
//        llp.swapNodes(llp.head, 4, 6);
//        llp.printList(llp.head);
//        llp.isPalindrome(llp.head);
    }
}
