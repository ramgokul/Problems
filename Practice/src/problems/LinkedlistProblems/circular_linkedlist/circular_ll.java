package problems.LinkedlistProblems.circular_linkedlist;

public class circular_ll {

    Node last;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node insertToEmpty(Node node, int data) {
        Node last = node;

        if (last != null) {
            return last;
        }

        Node new_data = new Node(data);
        new_data.next = new_data;

        return new_data;
    }

    public Node insertAtBegin(Node last, int data){

        if (last == null){
            insertAtBegin(last, data);
        }

        Node new_data = new Node(data);
        new_data.next = last.next;
        last.next = new_data;
        return last;
    }

    public Node insertAtEnd(Node last, int data){

        if (last == null){
            return null;
        }

        Node new_data = new Node(20);
        Node temp = last.next;
        last.next = new_data;
        new_data.next = temp;
        last = new_data;

        return last;

    }

    public Node insertAfter(Node last, int data, int item){

        if (last == null){
            return null;
        }

        Node p = last.next;

        do{
            if (p.data == item){
                Node new_data = new Node(data);
                Node temp = p.next;
                p.next = new_data;
                new_data.next = temp;
            }
            p = p.next;
        }while (p != last.next);

        return last;
    }

    public void printList(Node last) {
        if (last ==  null){
            System.out.println("List is empty");
        }

        Node n = last;

        do {
            System.out.println(n.next.data);
            n = n.next;
        }while (n != last);

        System.out.println();

    }


    public static void main(String[] args) {
        circular_ll is = new circular_ll();
        Node last_element = null;

        last_element = is.insertToEmpty(is.last, 5);
        is.printList(last_element);
        System.out.println("First last : "+last_element.data);

        last_element = is.insertAtBegin(last_element, 10);
        is.printList(last_element);
        System.out.println("Second last : "+last_element.data);

        last_element = is.insertAtBegin(last_element, 15);
        is.printList(last_element);
        System.out.println("Third last : "+last_element.data);

        last_element = is.insertAtEnd(last_element, 20);
        is.printList(last_element);
        System.out.println("Fourth last : "+last_element.data);

        last_element = is.insertAfter(last_element, 25, 20);
        is.printList(last_element);

    }
}
