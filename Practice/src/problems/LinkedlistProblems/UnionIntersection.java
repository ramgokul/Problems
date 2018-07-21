package problems.LinkedlistProblems;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    Node head;

    static class Node{
        int data;
        Node next;

         Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void append(Node prev_node, int new_data){
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    public UnionIntersection intersection(Node head1, Node head2){
        Set<Integer> set = new HashSet<>();
        Node n1 = head1, n2 = head2;
        UnionIntersection result = new UnionIntersection();

        while (n1 != null){
            set.add(n1.data);
            n1 = n1.next;
        }

        while (n2 != null){
            if (set.contains(n2.data)){
                result.push(n2.data);
            }
            n2 = n2.next;
        }

        return result;
    }

    public UnionIntersection union(Node head1, Node head2){
        Set<Integer> set = new HashSet<>();
        Node n1 = head1, n2 = head2;
        UnionIntersection result = new UnionIntersection();

        while (n1 != null){
            set.add(n1.data);
            n1 = n1.next;
        }

        while (n2 != null){

            if (!set.contains(n2.data)){
                set.add(n2.data);
            }
            n2 = n2.next;
        }

        for (int s : set){
            result.push(s);
        }

        return result;
    }

    public int findIntersectionPoint(Node node1, Node node2){
        int len1 = getListLength(node1);
        int len2 = getListLength(node2);
        int diff;

        if (len1 > len2){
            diff = len1 - len2;
            return getIntNode(diff, node1, node2);
        }else {
            diff = len2 = len1;
            return  getIntNode(diff, node2, node1);
        }
    }

    private int getIntNode(int diff, Node n1, Node n2){
        Node current1 = n1;
        Node current2 = n2;

        for (int i=0; i<diff; i++){
            if (current1 == null){
                return -1;
            }
            current1 = current1.next;
        }

        while (current1 !=null && current2 != null){
            if (current1.data == current2.data){
                System.out.println("Intersection node : "+current1.data);
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }

    public int getListLength(Node node){
        Node n = node;
        int count = 0;

        while (n != null){
            count++;
            n = n.next;
        }
        return count;
    }

    public Node reverseListInGroups(Node node, int k){
        Node current = node, prev = null, next = null;
        int count = 0;

        while (count<k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null){
            node.next = reverseListInGroups(next, k);
        }

        head = prev;
        return prev;
    }

    public Node reverseListInGroupsAlternate(Node node, int k){
        Node current = node, prev = null, next = null;
        int count = 0;

        while (count<k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (node.next != null){
            node.next = current;
        }
//        System.out.println("Current data : "+current.data);

        count = 0;
        while (count < k-1 && current != null){
            current = current.next;
        }

        if (current != null){
            current.next = reverseListInGroupsAlternate(current.next, k);
        }

//        head = prev;
        return prev;

    }

    public void print(){
        Node n = head;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnionIntersection u1 = new UnionIntersection();
        u1.push(9);
        u1.push(6);
        u1.push(3);
        u1.append(u1.head.next.next, 15);
        u1.append(u1.head.next.next.next, 30);
        u1.append(u1.head.next.next.next.next, 50);
        u1.print();
//        u1.reverseListInGroups(u1.head,2);
        u1.reverseListInGroupsAlternate(u1.head,2);
        u1.print();

////        u.head = new Node(1);
////        u.push(2);
////        u.append(u.head.next, 3);
////        u.append(u.head.next.next, 4);
////        u.print();
//
//        UnionIntersection u2 = new UnionIntersection();
//        u2.push(10);
//        u2.append(u2.head, 15);
//        u2.append(u2.head.next, 30);
//
////        u2.head = new Node(4);
////        u2.push(2);
////        u2.push(5);
////        u2.push(6);
////
//        UnionIntersection u3 = new UnionIntersection();
//        int result = u3.findIntersectionPoint(u1.head, u2.head);
//        System.out.println("Result : "+result);
////        UnionIntersection u4 = new UnionIntersection();
//
////        u3 = u3.intersection(u1.head, u2.head);
////        u3.print();
////
////        u4 = u4.union(u.head, u2.head);
////        u4.print();
    }
}
