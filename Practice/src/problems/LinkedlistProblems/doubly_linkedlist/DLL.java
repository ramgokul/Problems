package problems.LinkedlistProblems.doubly_linkedlist;

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


    void printList(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.push(7);
        dll.push(8);
        dll.insertAfter(dll.head, 9);
        dll.insertAtEnd(dll.head, 10);
        dll.insertBefore(dll.head.next.next, 6);
//        dll.deleteNode(dll.head.next.next.next.next);
        dll.printList(dll.head);

        dll.reverse(dll.head);
        System.out.println();
        dll.printList(dll.head);
    }
}
