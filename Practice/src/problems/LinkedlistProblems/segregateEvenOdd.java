package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class segregateEvenOdd {
    Node head;
    static Node headA = null;
    static Node headB = null;

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

    public void insertAfter(Node prev_node, int data){
        Node new_node = new Node(data);
        prev_node.next = new_node;
        new_node.next = null;
    }

    public void append(int new_data){
        if(this.head == null)
        {
            Node n = new Node(new_data);
            this.head = n;
            return;
        }

        Node n = head;
        while(n.next != null)
        {
            n = n.next;
        }

        Node new_node = new Node(new_data);
        n.next = new_node;
        new_node.next = null;
    }


    public Node evenOdd(Node node){
        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;
        Node current = node;

        while (current != null){
            int element = current.data;

            if (element % 2 == 0){

                if (evenStart == null){
                    evenStart = current;
                    evenEnd = evenStart;
                }else {
                    evenStart.next = current;
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
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
        return evenStart;
    }

    public void splitListAlternate(Node node){
        Node current = node;
        headA = current;
        headB = current.next;

        while (current != null && current.next != null){
            Node nxt = current.next;
            Node nxt_nxt = current.next.next;
            current.next = nxt_nxt;

            if (nxt != null && nxt.next != null){
                nxt.next = nxt.next.next;
            }else {
                nxt.next = null;
                return;
            }

            current =current.next;
        }
    }

    public segregateEvenOdd mergeList(Node n1, Node n2){
        Set<Integer> set = new LinkedHashSet<>();
        segregateEvenOdd sg2 = new segregateEvenOdd();

        Node x = n1;
        while (x != null){
            set.add(x.data);
            x = x.next;
        }

        Node y = n2;
        while (y != null){
            if (!set.contains(y.data)){
                set.add(y.data);
            }
            y = y.next;
        }

        for (int val : set){
            System.out.println("Val : "+val);
            sg2.append(val);
        }

        return sg2;
    }

    public Node reverseLinkedList(Node node){
        Node current = node, prev = null, next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
//        print();
        return prev;
    }

    void _delLesserNodes(){
        Node current = head;
        Node maxNode = head;
        Node temp;

        while (current != null && current.next != null){

            if (current.next.data < maxNode.data){
                temp = current.next;
                current.next = temp.next;
//                temp = null;
            }else {
                current = current.next;
                maxNode = current;
            }
        }
//        print(this.head);
    }

    void delLesserNodes(Node node){
        reverseLinkedList(node);
        _delLesserNodes();
        reverseLinkedList(head);
    }

    int findLength(Node node){
        int count = 0;
        Node temp = node;

        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count++;
    }

    segregateEvenOdd addNumbersInList(segregateEvenOdd sg1, segregateEvenOdd sg2){
        segregateEvenOdd result = new segregateEvenOdd();
        int carry = 0, sum;

        Node head1 = sg1.head, head2 = sg2.head;

        while (head1 != null && head2 != null){
            sum = carry + head1.data + head2.data;
            carry = (sum>=10?1:0);
            sum = sum % 10;
            result.push(sum);

            head1 = head1.next;
            head2 = head2.next;
        }

        if (carry > 0){
            result.push(carry);
        }

        return result;
    }

    void deleteNode(Node node, Node n){

        if (node == n){
            if (node.next == null){
                System.out.println("There is only one element in the linked list");
                return;
            }

            head = node.next;
            return;
        }

        Node temp = node;
        Node prev = null;

        while (temp != null && temp != n){
            prev = temp;
            temp = temp.next;
        }

        if (temp == null){
            System.out.println("Node to be deleted not found");
            return;
        }

        prev.next = temp.next;
    }

    void sortZeroOnesTwos(Node node){
        int[] count = {0,0,0};
        Node current = node;

        while (current != null){
            count[current.data]++;
            current = current.next;
        }

        System.out.println(Arrays.toString(count));
        current = node;
        int i = 0;

        while (current != null){
            if (count[i] == 0){
                i++;
            }else {
                current.data = i;
                count[i]--;
                current = current.next;
            }
        }
    }

    Node sortZeroOnesTwoss(Node node){
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        Node zero = zeroD, one = oneD, two = twoD;
        Node current = node;

        while (current != null){
            if (current.data == 0){
                zero.next = current;
                zero = zero.next;
            }else if (current.data == 1){
                one.next = current;
                one = one.next;
            }else {
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }

        zero.next = oneD.next != null ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        Node new_head = zeroD.next;
        System.out.println("Head : "+head.data);
        deleteNode(zeroD, zeroD);
        deleteNode(oneD, oneD);
        deleteNode(twoD, twoD);

        return new_head;
    }

    public void deleteNnodesAfterMnodes(Node node, int m, int n){
        Node current = node;
        int x = m, y = n;

        while (current != null){
            m = x;
            n = y;

            while (m > 1){
                m--;
                current = current.next;
            }


            Node nxt_nxt = current.next;
            System.out.println("1st : "+nxt_nxt.data);
            while (nxt_nxt != null && n>1){
                n--;
                nxt_nxt = nxt_nxt.next;
            }
            System.out.println("2nd : "+nxt_nxt.data);
            Node nxt_nxt_nxt = nxt_nxt.next;
            current.next = nxt_nxt_nxt;
            current = nxt_nxt_nxt;
        }
    }

    void deleteMiddleNode(Node node){
        Node temp = node, mid = node;
        Node prev = null;
        int count = 0;

        while (temp != null){
            prev = mid;

            if (count % 2 == 1){
                mid = mid.next;
            }
            count++;

            temp = temp.next;
        }

        prev.next = mid.next;
    }

    Node findMiddleNode(Node node){
        Node temp = node, mid = node;
        int count = 0;

        while (temp != null){

            if (count % 2 == 1){
                mid = mid.next;
            }

            count++;
            temp = temp.next;
        }
        return mid;
    }

    Node getMiddle(Node h)
    {
        //Base case
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;

        // Move fastptr by two and slow ptr by one
        // Finally slowptr will point to middle node
        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }

    Node sortedMerge(Node a, Node b){
        Node result = null;

        if (a == null){
            return b;
        }

        if (b == null){
            return a;
        }

        if (a.data <= b.data){
            result = a;
            result.next = sortedMerge(a.next, b);
        }else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    Node mergeSort(Node node){

        // Reference url : http://javabypatel.blogspot.com/2015/12/merge-sort-linked-list.html

        if (node == null || node.next ==  null){
            return node;
        }

        Node middle = getMiddle(node);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(node);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    void makeMiddleNodeAsHead(Node node){
        Node temp = node, mid = node;
        Node prev = null;
        int count = 0;

        while (temp != null){
            prev = mid;

            if (count % 2 == 1){
                mid = mid.next;
            }
            count++;

            temp = temp.next;
        }

        Node new_s = mid;
        prev.next = mid.next;
        new_s.next = head;
        head = new_s;
    }

    int countRotationsInSortedRotatedList(Node node){
        Node current = node;
        int rotation_count = 0;

        while (current != null && current.data < current.next.data){
            rotation_count++;
            current = current.next;
        }

        return rotation_count;
    }

    void findNthNodeFromEnd(Node node, int n, int k){
        Node p = node, q = node;
        int cnt = 1;

        while (cnt <= n - 1){
            q = q.next;
            cnt += 1;
        }

        while (q.next != null){
            q = q.next;
            p = p.next;
        }

        System.out.println("Nth node from end : "+p.data);

        Node nxt = p.next;

        Node new_node = new Node(k);
        p.next = new_node;
        new_node.next = nxt;
    }

    void checkLengthIsEvenOrOdd(Node node){
        Node p = node;

        while (true){

            if (p == null){
                System.out.println("Its an even length linked list");
                break;
            }else if (p.next == null){
                System.out.println("Its an odd length linked list");
                break;
            }

            p = p.next.next;
        }
    }

    Node mergeTwoSortedLists(Node n1, Node n2){
        Node p = n1, q = n2;
        Node sorting = null, new_head = null;

        if (p == null){
            return q;
        }

        if (q == null){
            return p;
        }

        if (p != null && q != null){

            if (p.data <= q.data){
                sorting = p;
                p = sorting.next;
            }else {
                sorting = q;
                q = sorting.next;
            }
        }

        new_head = sorting;

        while (p != null && q != null){

            if (p.data <= q.data){
                sorting.next = p;
                sorting = p;
                p = sorting.next;
            }else {
                sorting.next = q;
                sorting = q;
                q = sorting.next;
            }
        }

        if (p == null){
            sorting.next = q;
        }

        if (q == null){
            sorting.next = p;
        }

        return new_head;
    }

    void multiplyTwoLists(Node n1, Node n2){
        int num1 = 0, num2 = 0;

        while (n1 != null || n2 != null){

            if (n1 != null){
                num1 = num1 * 10 + n1.data;
                n1 = n1.next;
            }

            if (n2 != null){
                num2 = num2 * 10 + n2.data;
                n2 = n2.next;
            }
        }

        long result = num1 * num2;
        System.out.println("Multiplication result : "+result);
    }


    void merge2LinkedListsAlternatePos(Node n1, Node n2){
        head = n1;
        Node p = n1, q = n2, p_nxt = null, q_nxt = null;


        while (p != null && q != null){
            p_nxt = p.next;
            q_nxt = q.next;

            q.next = p_nxt;
            p.next = q;

            p = p_nxt;
            q = q_nxt;
        }

        print();
        print(q);
    }

    Node mergeKsortedLinkedLists(Node arr[], int last){

        while (last != 0) {
            int i = 0, j = last;

            while (i < j) {

                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;

                if (i >= j) {
                    last = j;
                }
            }
        }
        return arr[0];
    }


    void deleteAllDuplicates(Node node){
        Node current = node;
        Node dummy = new Node(0);
        dummy.next = current;
        Node prev = dummy;

        while (current != null){

            while (current.next != null && prev.next.data == current.next.data){
                current = current.next;
            }

            if (prev.next == current){
                prev = prev.next;
            }else {
                prev.next = current.next;
            }

            current = current.next;
        }
        head = dummy.next;
    }


    public void print(){
        Node n = head;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void print(Node x){
        Node n = x;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        segregateEvenOdd sg1 = new segregateEvenOdd();
        sg1.head = new Node(5);
        sg1.push(5);
        sg1.push(4);
        sg1.push(4);
        sg1.push(1);
        sg1.print();
        sg1.deleteAllDuplicates(sg1.head);
        sg1.print();
//
//        segregateEvenOdd sg2 = new segregateEvenOdd();
//        sg2.head = new Node(10);
//        sg2.push(9);
//        sg2.push(8);
//        sg2.push(7);
//        sg2.push(6);

//        int k = 3, n = 4;
//        Node[] arr = new Node[k];
//
//        arr[0] = new Node(1);
//        arr[0].next = new Node(3);
//        arr[0].next.next = new Node(5);
//        arr[0].next.next.next = new Node(7);
//
//        arr[1] = new Node(2);
//        arr[1].next = new Node(4);
//        arr[1].next.next = new Node(6);
//        arr[1].next.next.next = new Node(8);
//
//        arr[2] = new Node(0);
//        arr[2].next = new Node(9);
//        arr[2].next.next = new Node(10);
//        arr[2].next.next.next = new Node(11);
//
//        Node head = sg1.mergeKsortedLinkedLists(arr, k-1);
//        sg1.print(head);

//        sg1.checkLengthIsEvenOrOdd(sg1.head);
//        sg1.deleteNode(sg1.head, sg1.head.next.next);
//        sg1.print();
//        sg2.print();
//        sg1.merge2LinkedListsAlternatePos(sg1.head, sg2.head);
//        sg1.multiplyTwoLists(sg1.head, sg2.head);
//        sg1.findNthNodeFromEnd(sg1.head, 2, 55);
//        Node s = sg1.sortZeroOnesTwoss(sg1.head);
//        sg1.print(s);
//        Node n = sg1.mergeSort(sg1.head);
//        sg2.print();
//        Node n = sg1.mergeTwoSortedLists(sg1.head, sg2.head);
//        Node n = sg1.sortedMerge(sg1.head, sg2.head);
//        sg1.print(n);
//        sg1.findNthNodeFromEnd(sg1.head, 5, 55);
//        sg1.makeMiddleNodeAsHead(sg1.head);
//        sg1.deleteMiddleNode(sg1.head);
//        sg1.print();
//        sg1.deleteNnodesAfterMnodes(sg1.head,3,2);

//        sg1.sortZeroOnesTwos(sg1.head);
//        sg1.print();

//        int len1 = sg1.findLength(sg1.head);
////        System.out.println("Len1 : "+len1);
//
//        segregateEvenOdd sg2 = new segregateEvenOdd();
//        sg2.head = new Node(3);
//        sg2.push(6);
//        sg2.push(9);
//        sg2.push(0);
//        sg2.push(9);
//
//        int len2 = sg2.findLength(sg2.head);
////        System.out.println("Len2 : "+len2);
//
//        if (len1 > len2){
//            int diff = len1 - len2;
//
//            for (int i=0; i<diff; i++){
//                sg2.push(0);
//            }
//        }else {
//            int diff = len2 - len1;
//
//            for (int i=0; i<diff; i++){
//                sg1.push(0);
//            }
//        }
//
////        System.out.println("New list one");
////        sg1.print();
//
////        System.out.println("New list two");
////        sg2.print();
//
//        Node rev1 = sg1.reverseLinkedList(sg1.head);
//        Node rev2 = sg2.reverseLinkedList(sg2.head);
//
////        sg1.print(rev1);
////        sg2.print(rev2);
//
//        segregateEvenOdd sg3 = new segregateEvenOdd();
//        sg3 = sg3.addNumbersInList(sg1, sg2);
//        sg3.print(sg3.head);

//        sg.delLesserNodes(sg.head);

//        sg.print(sg.head);
//        Node node1 = sg.evenOdd(sg.head);
//        sg.print(node1);
//        sg.splitListAlternate(node1);
//        sg.print(headA);
//        sg.print(headB);

//        segregateEvenOdd union = new segregateEvenOdd();
//        union = union.mergeList(headA, headB);
//        union.print();
    }
}
