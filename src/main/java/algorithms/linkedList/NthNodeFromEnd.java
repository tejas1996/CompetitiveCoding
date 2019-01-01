package algorithms.linkedList;

import java.util.Scanner;

public class NthNodeFromEnd {

    public static void main(String[] args) {

        Node head = formLinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNthFromLast(head, n, 0);

    }

    private static int printNthFromLast(Node node, int n, int level) {
        if (node.next == null) {
            if (n == 1) {
                System.out.println(node.data);
            }
            if (n > level + 1) {
                System.out.println("-1");
            }
            return level;
        }
        int length = printNthFromLast(node.next, n, level + 1);
        if (length - level + 1 == n) {
            System.out.println(node.data);
        }
        return length;

    }

    public static Node formLinkedList() {

        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
//        five.next = six;
        return root;
    }

}
