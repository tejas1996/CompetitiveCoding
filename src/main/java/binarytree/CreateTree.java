package binarytree;

import competativeCoding.Node;
import competativeCoding.Tree;

import java.util.Scanner;

public class CreateTree {

    public static void main(String[] args) {

        System.out.println("Enter the root element");

        Node node = new Node(5);

        Tree tree = new Tree(node);
        tree.addNode(3);
        tree.addNode(8);
        tree.addNode(1);
        tree.addNode(6);
        tree.addNode(10);

        tree.print(node);
    }


}
