package problems.LinkedlistProblems.circular_linkedlist;

public class sortedInsert {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    public void sort_insert(int data) {

        Node new_data = new Node(data);
        Node current = head;

        if (current == null){

            new_data.next = new_data;
            head = new_data;

        }else if (current.data >= data){

            while (current.next != head){
                current = current.next;
            }

            current.next = new_data;
            new_data.next = head;
            head = new_data;

        }else {

            while (current.next != head && current.next.data < data){
                current = current.next;
            }

            Node temp = current.next;
            current.next = new_data;
            new_data.next = temp;
        }
    }

    void printList(){
        Node current = head;

        do{
            System.out.println(current.data);
            current = current.next;
        }while (current != head);
    }


    public static void main(String[] args) {
        sortedInsert si = new sortedInsert();
        int arr[] = new int[] {12, 56, 2, 11, 1, 90};

        for (int i : arr){
            si.sort_insert(i);
        }

        si.printList();
        System.out.println("head : "+si.head.data);
    }

}