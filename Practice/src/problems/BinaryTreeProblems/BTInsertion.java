package problems.BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BTInsertion {

    static Node root, temp;

    static class Node{
        int item;
        Node left, right;

        public Node(int item) {
            this.item = item;
            left = null;
            right = null;
        }
    }

    static void insert(Node temp, int key)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }

    static void inorder_traversal(Node temp){

        if (temp == null){
            return;
        }

        inorder_traversal(temp.left);
        System.out.print(temp.item + " ");
        inorder_traversal(temp.right);
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);

        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        inorder_traversal(root);
        System.out.println();

        int key = 12;
        insert(root, key);

        inorder_traversal(root);
    }

}
