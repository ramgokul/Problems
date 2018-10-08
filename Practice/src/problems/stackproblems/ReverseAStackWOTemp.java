package problems.stackproblems;

public class ReverseAStackWOTemp {


    /*
        Reverse a Stack without using recursion and extra space .Even the functional Stack is not allowed.

        Examples:

        Input : 1->2->3->4
        Output : 4->3->2->1

        Input :  6->5->4
        Output : 4->5->6

        We can reverse a string in O(1) time if we internally represent the stack as inked list. Reverse a stack would require a reversing a linked list which can be done with O(n) time and O(1) extra space.
     */

    StackNode top;

    class StackNode{

        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int data){

        if (top == null){
            top = new StackNode(data);
            return;
        }

        StackNode new_node = new StackNode(data);
        new_node.next = top;
        top = new_node;
    }

    StackNode reverse(StackNode node){
        StackNode current = node, prev = node, next = null;
        current = current.next;
        prev.next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    void printList(StackNode node){
        StackNode current  = node;

        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ReverseAStackWOTemp r = new ReverseAStackWOTemp();
        r.push(1);
        r.push(2);
        r.push(3);
        r.push(4);

        r.printList(r.top);

        r.reverse(r.top);

        r.printList(r.top);
    }
}
