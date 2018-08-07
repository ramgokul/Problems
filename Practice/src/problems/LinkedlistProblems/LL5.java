package problems.LinkedlistProblems;

public class LL5 {

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
                    evenEnd = evenStart = current;
//                    evenEnd = evenStart;
                }else {
//                    evenStart.next = current;
                    evenEnd.next = current;
                    evenEnd = current;
                }

            }else {

                if (oddStart == null){
                    oddEnd = oddStart = current;
//                    oddEnd = oddStart;
                }else {
                    oddEnd.next = current;
                    oddEnd = current;
                }
            }
            current = current.next;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
        return evenStart;
    }

    Node partitionListAroundAGivenValue(Node node, int key){
        /*
            Examples:

            Input : 1->4->3->2->5->2->3,
                    x = 3
            Output: 1->2->2->3->3->4->5
         */

        Node lessthanStart = null, lessthanEnd = null, equaltoStart = null, equaltoEnd = null, greaterthanstart = null, greaterthanEnd = null;
        Node current = node;

        while (current != null){
            int element_data = current.data;

            if (element_data < key){
                if (lessthanStart == null){
//                    lessthanStart = current;
//                    lessthanEnd = lessthanStart;
                    lessthanEnd = lessthanStart = current;
                }else {
//                    lessthanStart.next = current;
//                    lessthanEnd = lessthanEnd.next;
                    lessthanEnd.next = current;
                    lessthanEnd = current;
                }
            }else if (element_data == key){
                if (equaltoStart == null){
//                    equaltoStart = current;
//                    equaltoEnd = equaltoStart;
                    equaltoEnd = equaltoStart = current;
                }else {
//                    equaltoStart.next = current;
//                    equaltoEnd = equaltoEnd.next;
                    equaltoEnd.next = current;
                    equaltoEnd = current;
                }
            }else if (element_data > key){
                if (greaterthanstart == null){
//                    greaterthanstart = current;
//                    greaterthanEnd = greaterthanstart;
                    greaterthanEnd = greaterthanstart = current;
                }else {
//                    greaterthanstart.next = current;
//                    greaterthanEnd = greaterthanEnd.next;
                    greaterthanEnd.next = current;
                    greaterthanEnd = current;
                }
            }

            current = current.next;
        }


        if (greaterthanEnd != null){
            greaterthanEnd.next = null;
        }

        if (lessthanStart == null){

            if (equaltoStart == null){
                return greaterthanstart;
            }

            equaltoEnd.next = greaterthanstart;
            return equaltoStart;
        }

        if (equaltoStart == null){
            lessthanEnd.next = greaterthanstart;
            return lessthanStart;
        }

        lessthanEnd.next = equaltoStart;
        equaltoEnd.next = greaterthanstart;
//        greaterthanEnd.next = null;


        return lessthanStart;
    }

    void findSmallestNLargestElementInList(Node node){
        Node current = node;
        int max = Integer.MIN_VALUE;

        while (current != null){
            if (max < current.data){
                max = current.data;
            }
            current = current.next;
        }

        System.out.println("Max element : "+max);

        int min = Integer.MAX_VALUE;
        current = node;
        
        while (current != null){
            if (min > current.data){
                min = current.data;
            }
            current = current.next;
        }

        System.out.println("Min element : "+min);

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
        LL5 list1 = new LL5();
        list1.push(50);
        list1.push(2);
        list1.push(30);
        list1.push(5);
        list1.push(4);
        list1.push(10);
        list1.print();
        list1.findSmallestNLargestElementInList(list1.head);
//        Node rock = list1.partitionListAroundAGivenValue(list1.head, 3);
//        list1.evenOdd(list1.head);
//        list1.print(rock);
//        list1.print();
    }


}
