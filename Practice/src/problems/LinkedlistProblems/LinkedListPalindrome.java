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

    boolean isPalindromeUtil(Node right)
    {
        left = head;

        /* stop recursion when right becomes NULL */
        if (right == null)
            return true;

        /* If sub-list is not palindrome then no need to
           check for current left and right, return false */
        boolean isp = isPalindromeUtil(right.next);
        if (isp == false)
            return false;

        /* Check values at current left and right */
        boolean isp1 = (right.data == (left).data);

        /* Move left to next node */
        left = left.next;

        return isp1;
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
        list.printList();
        System.out.println(list.isPalindromeUtil(list.head));
    }
}
