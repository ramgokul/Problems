package problems.BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BTDeletion {
    static Node root, temp;

    static class Node{
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }


    static void delete_key(Node root, int key){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node node_to_be_deleted = null, right_most_node = null;

        while (!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if (temp.key == key){
                node_to_be_deleted = temp;
            }

            if (temp.left != null){
                q.add(temp.left);
            }

            if (temp.right != null){
                q.add(temp.right);
            }
        }


        right_most_node = temp;
        int right_most_node_data = temp.key;
        System.out.println(right_most_node_data);
        System.out.println(node_to_be_deleted.key);

        node_to_be_deleted.key = right_most_node_data;

        Queue<Node> r = new LinkedList<>();
        r.add(root);

        while (!r.isEmpty()){
            temp = r.peek();
            r.remove();

            if (temp.left != null){
                if (temp.left == right_most_node){
                    temp.left = null;
                    return;
                }else {
                    r.add(temp.left);
                }
            }

            if (temp.right != null){
                if (temp.right == right_most_node){
                    temp.right = null;
                    return;
                }else {
                    r.add(temp.right);
                }
            }
        }

    }


    static void order_traversal(Node temp){

        if (temp == null){
            return;
        }

        order_traversal(temp.left);
        System.out.print(temp.key + " ");
        order_traversal(temp.right);
    }


    public static void main(String[] args) {
        root = new Node(10);

        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);

        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Order before deletion");
        order_traversal(root);
        System.out.println();

        delete_key(root, 12);

        System.out.println("Order after deletion");
        order_traversal(root);

    }
}
