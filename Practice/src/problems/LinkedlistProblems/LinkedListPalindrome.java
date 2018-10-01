package problems.LinkedlistProblems;

public class LinkedListPalindrome {
    Node head, left;

    static class Node{
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public void push(char new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, char key){
        if (prev_node == null){
            return;
        }

        Node new_node = new Node(key);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void printList(){
        Node n = head;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public void printList(Node node){
        Node n = node;

        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    void isPalindromeUtil(Node node)
    {
        Node p = node, q = node, new_s = null;

        while (true){
            q = q.next.next;

            if (q != null && q.next == null){
                new_s = p.next.next;
                break;
            }

            if (q == null){
                new_s = p.next;
                break;
            }
            p = p.next;
        }
        p.next = null;
        Node rev_s = reverseLinkedList(new_s);
        if (compareLists(node, rev_s)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }



    Node reverseLinkedList(Node node){
        Node current = node, prev = null, next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    boolean compareLists(Node n1, Node n2){
        boolean isEqual = true;

        if (n1 == null && n2 == null){
            isEqual = true;
            return isEqual;
        }

        while (n1 != null && n2 != null){

            if (n1.data == n2.data){
                n1 = n1.next;
                n2 = n2.next;
            }else {
                isEqual =  false;
                break;
            }

        }
        return isEqual;
    }



    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();
        list.push('a');
        list.insertAfter(list.head, 'b');
        list.insertAfter(list.head.next, 'c');
        list.insertAfter(list.head.next.next, 'd');
        list.insertAfter(list.head.next.next.next, 'c');
        list.insertAfter(list.head.next.next.next.next, 'b');
        list.insertAfter(list.head.next.next.next.next.next, 'a');
//        list.printList();
        list.isPalindromeUtil(list.head);
//        System.out.println(list.isPalindromeUtil(list.head));
    }
}
