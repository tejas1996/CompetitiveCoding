package algorithms.trees;

import competativeCoding.Node;

import java.util.HashMap;
import java.util.Scanner;

public class LeftView {


    static int depth = 0;
    public static void main(String args[]) {
        Node root = formTree1();
        leftView(root, 1);

    }

    private static void leftView(Node node, int height) {

        if (node == null) {
            return;
        }

        if (height > depth) {
            System.out.println(node.item);
            depth = height;
        }

        if (node.left != null) {
            leftView(node.left, height + 1);
        }
        if (node.right != null) {
            leftView(node.right, height + 1);
        }

    }


    private static Node formTree1() {

        Node root = new Node(5);
        Node three = new Node(3);
        Node three2 = new Node(3);
        root.left = three;
        root.right = three2;
        Node one1 = new Node(1);
        Node one2 = new Node(1);
        Node two = new Node(2);
        Node two2 = new Node(2);
        three.left = one1;
        three.right = two;
        three2.left = two2;
        three2.right = one2;

        Node test = new Node(6);
        one2.right = test;

        return root;

    }


}
