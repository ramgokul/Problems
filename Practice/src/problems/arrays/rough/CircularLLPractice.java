package problems.arrays.rough;

public class CircularLLPractice {

    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data){

        Node new_node = new Node(data);

        if (head == null){
            new_node.next = new_node;
            head = new_node;
            return;
        }

        new_node.next = head;
        head.next = new_node;
        head = new_node;

    }

    void printList(){
        Node current = head;

        do{
            System.out.println(current.data);
            current = current.next;
        }while (current != head);
    }

    void insert_in_sorted_manner(Node node, int data){

        Node current = node;


        if (head == null){
            push(data);

        }else if (current.data >= data){
            Node new_node = new Node(data);

            while (current.next != head){
                current = current.next;
            }

            current.next = new_node;
            new_node.next = head;
            head = new_node;

        }else {
            Node new_node = new Node(data);
            while (current.next != head && current.next.data < data){
                current = current.next;
            }

            new_node.next = current.next;
            current.next = new_node;
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] {12, 56, 2, 11, 1, 90};
        CircularLLPractice cp = new CircularLLPractice();

        for (int n : arr){
            cp.insert_in_sorted_manner(cp.head, n);
        }

        cp.printList();
    }


}
