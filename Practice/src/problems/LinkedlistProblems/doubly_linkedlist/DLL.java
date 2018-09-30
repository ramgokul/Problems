package problems.LinkedlistProblems.doubly_linkedlist;


import javafx.util.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DLL {

    static Node head;

    static class Node{
        int data;
        Node prev; Node next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

     void push(int data){
        Node new_node = new Node(data);

        if (head == null){
            new_node.next = null;
            new_node.prev = null;
            head = new_node;
            return;
        }

        new_node.next = head;
        head.prev = new_node;
        new_node.prev = null;

        head = new_node;
    }

    void insertAfter(Node prev_node, int data){
        Node new_node = new Node(data);

        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;
        new_node.next.prev = new_node;

    }

    void insertBefore(Node node, int data){
        Node new_node = new Node(data);

        new_node.prev = node.prev;
        node.prev = new_node;
        new_node.next = node;
        new_node.prev.next = new_node;
    }

    void insertAtEnd(Node node, int data){
        Node new_node = new Node(data);

        Node current = node;

        while (current.next != null){
            current = current.next;
        }

        new_node.next = current.next;
        current.next = new_node;
        new_node.prev = current;
    }

    void deleteNode(Node node){

        if (node == head){
            head = node.next;
            node.prev = null;
            return;
        }

        /* Change next only if node to be deleted is NOT the last node */
        if (node.next != null){
            node.next.prev = node.prev;
        }

        /* Change prev only if node to be deleted is NOT the first node */
        if (node.prev != null){
            node.prev.next = node.next;
        }
    }

    void reverse(Node node){
        Node current = node, temp = null;

        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        System.out.println();
        System.out.println("temp : "+temp.data);

        if (temp != null){
            head = temp.prev;
        }
    }

    void findPairsWithGivenSum(Node node, int sum){
        Node current = node;
        Set<Integer> map = new HashSet<>();

        while (current != null){

            if (map.contains(sum - current.data)){
                System.out.println("Pairs found --> ("+current.data+","+(sum-current.data)+")");
            }

            map.add(current.data);
            current = current.next;
        }
    }

    void findEvenOrOdd(Node node){
        Node current = node;

        while (current.next != null && current.next.next != null){
            current = current.next.next;
        }
        System.out.println(current.data);
        Boolean b = (current.next == null);
        System.out.println("Is it a odd length linked list : "+b);
    }

    void findTriplets(Node node, int sum){
        Set<Integer> map = new HashSet<>();

        for (Node ptr1 = node; ptr1 != null; ptr1 = ptr1.next){
            for (Node ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next){
                int total = ptr1.data + ptr2.data;
                int diff = sum - total;

                if (map.contains(sum - total) && diff != ptr1.data && diff != ptr2.data){
                    System.out.println("("+(sum-total)+","+ptr1.data+ ","+ptr2.data+")");
                }
                map.add(ptr2.data);
            }
        }

//        System.out.println(map);
    }

    /* For a sorted linked list */
    void removeDuplicates(Node node){
        Node current = node, prev = null;

        while (current.next != null){
            if (current.data == current.next.data){
                deleteNode(current.next);
            }else {
                current = current.next;
            }
        }

    }

    void removeDuplicatesFromUnsortedLinkedList(Node node){
        Node current = node;
        Set<Integer> set = new HashSet<>();

        while (current != null){
            int element = current.data;

            if (!set.contains(element)){
                set.add(element);
            }else {
                deleteNode(current);
            }
            current = current.next;
        }
    }


    void printList(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
//        dll.push(12);
//        dll.push(12);
//        dll.push(10);
//        dll.push(8);
//        dll.push(8);
//        dll.push(6);
//        dll.push(4);
//        dll.push(4);
//        dll.push(4);
//        dll.push(4);

          dll.push(12);
          dll.push(12);
          dll.push(10);
          dll.push(4);
          dll.push(8);
          dll.push(4);
          dll.push(6);
        dll.push(4);
        dll.push(4);
        dll.push(8);
        dll.removeDuplicatesFromUnsortedLinkedList(dll.head);
//        dll.deleteNode(dll.head.next.next.next.next);
        dll.printList(dll.head);
//        dll.removeDuplicates(dll.head);
//        dll.printList(dll.head);
//        dll.findTriplets(dll.head, 17);
//        dll.findPairsWithGivenSum(dll.head, 13);
//        dll.findEvenOrOdd(dll.head);
//        dll.reverse(dll.head);
//        System.out.println();
//        dll.printList(dll.head);
    }
}
