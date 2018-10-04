package problems.LinkedlistProblems;

import java.util.HashSet;
import java.util.Set;

public class LinkedList1 {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data){
        if (prev_node == null){
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void append(int new_data){
        Node new_node = new Node(new_data);

        Node n = head;

        while (n.next != null){
            n = n.next;
        }

        n.next = new_node;
    }

    public void deleteNode(int key){
        Node temp = head; Node prev = null;

        if (temp.data == key){

            if (temp.next == null){
                System.out.println("There is only one element in the list");
                return;
            }
            head = temp.next; //Changed head
            return;
        }

        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Prev : "+prev.data);
        System.out.println("temp : "+temp.data);
        if (temp == null){
            System.out.println("Key not found");
            return;
        }
        prev.next = temp.next;
    }

    public void deleteNodeAtGivenPosition(int pos){
        Node temp = head; Node prev = null;
        int initPos = 0;

        if (temp != null && pos == 0){
            head = temp.next;  // Changed head
            return;
        }

        while (temp != null && initPos != pos){
            prev = temp;
            temp = temp.next;
            initPos++;
        }

        if (temp == null){
            System.out.println("Position not present");
            return;
        }
        prev.next = temp.next;
    }

    public void getListLength(){
        Node temp = head;
        int count = 0;

        while (temp != null){
            temp = temp.next;
            count++;
        }
        System.out.println("Length of list : "+count);
    }

    public boolean searchElementInList(Node node, int key){

        if (node == null){
            return false;
        }else if (node.data == key){
            return true;
        }

        return searchElementInList(node.next, key);

    }

    public int getNthNode(Node node, int n){
        /*
            Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position.
            Example:

            Input:  1->10->30->14,  index = 2
            Output: 30
            The node at index 2 is 30
         */

        Node temp = head;
        int count = 0;

        while (temp != null && count <n){
            temp = temp.next;
            count++;
        }

        if (temp == null){
            System.out.println("Invalid node");
            return -1;
        }

        return temp.data;
    }

    public int getNthNodeFromEnd(Node node, int n){
        Node temp = node;
        int len = 0;

        while (temp != null){
            temp = temp.next;
            len++;
        }

        System.out.println("Length of the list : "+len);

        if (len < n){
            return -1;
        }

        temp = head;

        for (int i=1; i<len-n+1; i++){
            temp = temp.next;
        }

        return temp.data;
    }

    public int findMiddleElement(){
        Node temp = head;
        Node mid = head;

        int count = 0;

        while (temp != null){
            if (count%2 == 1){
                mid = mid.next;
            }
            count++;
            temp = temp.next;
        }

        if (mid == null){
            return -1;
        }

        return mid.data;

    }

    public int countNumberOfOccurencesOfElement(Node node, int key){
        Node temp = node;
        int count = 0;

        while (temp != null){
            if (temp.data == key){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public boolean detectLoopInList(Node node){
        Node temp = node;
        Set<Node> set = new HashSet<>();

        while (temp != null){
            if (set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        System.out.println("Length of the loop : "+set.size());
        return false;
    }

    public boolean detectLoopInList2(Node node){
        Node slow = head, fast = head;

        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                System.out.println("loop found");
                countNodesInALoop(slow);
                removeLoop(node, fast);
                return true;
            }
        }
        return false;
    }

    public void countNodesInALoop(Node node){
        Node temp = node;
        int res = 1;

        while (temp.next != node){
            res++;
            temp = temp.next;
        }
        System.out.println("Number of nodes in loop : "+res);
    }

    public void removeLoop(Node node, Node fast){

        while (node.next != fast.next){
            node = node.next;
            fast = fast.next;
        }
        fast.next = null;

    }

    public Node reverseLinkedList(Node node){
        Node current = node;
        Node prev = null, next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void seggregateEvenOdd(){
        Node current = head;
        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;

        while (current != null){
            int element = current.data;

            if (element % 2 == 0) {

                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }

            }else {
                    if (oddStart == null){
                        oddStart = current;
                        oddEnd = oddStart;
                    }else {
                        oddEnd.next = current;
                        oddEnd = oddEnd.next;
                    }
            }

            current = current.next;
        }

        if(oddStart == null || evenStart == null) {
            return;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
        printList();
    }

    /* For a sorted linked list */
    public void removeDuplicates(){
        Node current = head;
        Node next_next;

        while (current.next != null){
            if (current.data == current.next.data){
                next_next = current.next.next;
                current.next = next_next;
            }
            current = current.next;
        }
    }

    /* For a un-sorted linked list */
    public void removeDuplicates2(){
        Node current = head;
        Node previous = null;

        Set<Integer> set = new HashSet<>();

        while (current.next != null){

            int element = current.data;

            if (!set.contains(element)){
                set.add(element);
                previous = current;
            }else {
                previous.next = current.next;
            }

            current = current.next;
        }
    }



    public void deleteAlternateNodes(){
        Node current  = head, next_next;
//        int count = 0;

        while (current!= null && current != null){
            next_next = current.next.next;

//            if (count%2 == 0){
                current.next = null;
                current.next = next_next;
//            }

            current = current.next;
        }
    }

    public void swapNodes(int x, int y){

        if (x == y){
            return;
        }

        Node currX = head, currY = head, prevX = null, prevY = null;

        while (currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        while (currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null){
            System.out.println("Either elements not found");
            return;
        }

        if (prevX != null){
            prevX.next = currY;
        }else {
            head = currY;
        }

        if (prevY != null){
            prevY.next = currX;
        }else {
            head = currX;
        }

        Node temp2 = currX.next;
        currX.next = currY.next;
        currY.next = temp2;

        printList();

    }

    public Node pairwiseSwap(Node node){

        // Base Case: The list is empty or has only one node
        if (node == null || node.next == null) {
            return node;
        }

        // Store head of list after two nodes
        Node remaing = node.next.next;

        // Change head
        Node newhead = node.next;

        // Change next of second node
        node.next.next = node;

        // Recur for remaining list and change next of head
        node.next = pairwiseSwap(remaing);

        // Return new head of modified list
        return newhead;
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

        Node node3 = reverseLinkedList(node2);

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

    public void printList(){
        Node n = head;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList1 list1 = new LinkedList1();
        list1.head = new Node(2);
        list1.push(1);
        list1.insertAfter(list1.head, 3);
        list1.append(4);
        list1.push(5);
        list1.push(6);
        list1.push(7);
        list1.push(8);
        list1.printList();
        list1.swapNodes(6, 3);
//        list1.deleteNode(1);
//        list1.deleteNodeAtGivenPosition(10);
//        list1.printList();
//        list1.getListLength();
//        System.out.println(list1.searchElementInList(list1.head, 4));
//        System.out.println("Nth node data : "+list1.getNthNode(list1.head, 2));
//        System.out.println("Nth node data From end : "+list1.getNthNodeFromEnd(list1.head, 4));
//        System.out.println("Middle element of the list : "+list1.findMiddleElement());
//        System.out.println("Number of times 7 is repeated : "+list1.countNumberOfOccurencesOfElement(list1.head, 7));
//        list1.head.next.next.next.next.next.next = list1.head;
//        System.out.println(list1.detectLoopInList2(list1.head));
//        System.out.println(list1.detectLoopInList2(list1.head));
//         Node mynode = list1.reverseLinkedList(list1.head);
//        System.out.println(list1.head.data);
//        list1.seggregateEvenOdd();
//        list1.removeDuplicates2();
//        list1.printList();
//        list1.deleteAlternateNodes();
//        list1.swapNodes(6,5);
//        list1.pairwiseSwap(list1.head);
//        list1.printList();
//        list1.getListLength();
    }
}
