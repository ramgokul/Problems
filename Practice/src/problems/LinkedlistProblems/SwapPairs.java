package com.company;

public class SwapPairs {
    Node head;
    public static Node headA = null; //linked List 1
    public static Node headB = null; // Linked List 2

    static class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            next = null;
        }
    }

    public void push(String new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, String data){
        Node new_node = new Node(data);
        prev_node.next = new_node;
        new_node.next = null;
    }


    public Node swapPairs(Node node){
        Node p = node;
        Node new_s = p.next;

        while (true){
            Node q = p.next;
            Node temp = q.next;
            q.next = p;

            if (temp == null || temp.next ==  null){
                p.next = temp;
                break;
            }
            p.next = temp.next;
            p = temp;
        }
        head = new_s;
        return new_s;
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
        return prev;
    }


    public Node reverseNodesInPairs(Node node, int k){
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
            System.out.println("Next data : "+next.data);
            node.next = reverseNodesInPairs(next, k);
        }

        head = prev;
        return prev;
    }

    public Node reverseAlternateNodesInPairs(Node node, int k){
        Node current = node, prev = null, next = null;
        int count = 0;

        while (count<k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (node != null) {
            node.next = current;
        }


        count = 0;
        while (count < k-1 && current != null){
            current = current.next;
            count++;
        }
//        System.out.println("Next data1 : "+next.data);


        if (current != null){
            current.next = reverseAlternateNodesInPairs(current.next, k);
        }

        head = prev;
        return prev;
    }


    public void deleteAlternateNodes(Node node){
        Node current = node, prev = null, nxt_nxt = null;

        while (current != null && current.next != null){
            prev = current;
            nxt_nxt = current.next.next;
            prev.next = nxt_nxt;
            current = current.next;
        }

    }


    public void alternateSplitting(Node node){
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
                break ;
            }

            current = current.next;
        }
    }

    Node rotateLinkedList(Node node, int k){
        Node current = node;

        while (k > 1){
            current = current.next;
            k--;
        }

        Node new_start = current.next;
        current.next = null;

        current = new_start;

        while (current.next != null){
            current = current.next;
        }
        current.next = node;
        head = new_start;
        return new_start;
    }

    void deleteEveryKthNode(Node node, int k){
        Node current =  node;
        Node prev = null, nxt = null;
        int counter = 0;

        while (current != null){
            counter = k;

            while (counter>1){
                prev = current;
                nxt = current.next;
                counter--;
                current = current.next;
            }

            if (nxt != null && nxt.next != null){
                Node nxt_nxt = nxt.next;
                prev.next = nxt_nxt;
                current = nxt_nxt;
            }

        }
    }

    void removeDuplicatesFromSortedLinkList(Node node){
        Node current = node;

        while (current != null && current.next != null){

            if (current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
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
        SwapPairs sp = new SwapPairs();
        sp.head = new Node("b");
        sp.push("b");
        sp.push("a");
        sp.push("a");
        sp.insertAfter(sp.head.next.next.next, "e");
//        sp.insertAfter(sp.head.next.next.next.next, "f");
        sp.print();
        sp.removeDuplicatesFromSortedLinkList(sp.head);
//        sp.deleteEveryKthNode(sp.head, 3);
//        sp.rotateLinkedList(sp.head, 2);
        sp.print();
//        sp.swapPairs(sp.head);
//        sp.reverseLinkedList(sp.head);
//        sp.reverseNodesInPairs(sp.head, 2);
//        sp.reverseAlternateNodesInPairs(sp.head, 2);
//        sp.deleteAlternateNodes(sp.head);
//        sp.alternateSplitting(sp.head);
//        sp.print(headA);
//        sp.print(headB);
    }
}
