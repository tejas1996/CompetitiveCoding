package competativeCoding;

import javax.annotation.PostConstruct;

public class Tree {
    Node root;
    int number = 0;

    Node current;

    public Tree(Node root) {
        this.root = root;
    }

    @PostConstruct
    public void init() {

        root = new Node(-1);
        number = 0;
    }

    public void addNode(int value) {

        Node node = new Node(value);

        current = root;
        boolean flag = false;
        while (!flag) {

            if (value < current.value) {
                if (current.left == null) {
                    flag = true;
                    current.left = node;
                    number++;

                }
                current = current.left;
            } else {
                if (current.right == null) {
                    flag = true;
                    current.right = node;
                    number++;
                }
                current = current.right;

            }


        }

    }


    public void printInOrder(Node rootw) {

        if (rootw.value == root.value)
            rootw = root;

        Node local;
        local = rootw;
        if (local.left != null) {
            printInOrder(local.left);
        }

        System.out.println(local.value);

        if (local.right != null) {
            printInOrder(local.right);

        }


    }
}
