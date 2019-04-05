package algorithms.linkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeleteMNodes {
    public static void main(String[] args) {

        Node root = formLinkedList();
        int m = 2;
        int n = 3;
        Node answer = doTheThing(root, n, m);
        System.out.println(answer);
    }

    private static Node doTheThing(Node root, int n, int m) {

        Node current = root;
        while (current != null) {

            for (int i = 1; i < m; i++) {
                if (current.next == null) {
                    break;
                }
                current = current.next;
            }
            Node prev = current;
            for (int i = 0; i <= n; i++) {
                if (current == null) {
                    break;
                }
                current = current.next;
            }
            prev.next = current;

        }

        return root;

    }


    public static Node formLinkedList() {

        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node ix1 = new Node(7);
        Node ix2 = new Node(8);
        Node ix3 = new Node(9);
        Node ix4 = new Node(17);
        Node ix5 = new Node(27);
        Node ix6 = new Node(37);
        Node ix7 = new Node(47);
        Node ix8 = new Node(57);
        six.next = ix1;
        ix1.next = ix2;
        ix2.next = ix3;
        ix3.next = ix4;
        ix4.next = ix5;
        ix5.next = ix6;
        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
//        six.next = ix;
        return root;
    }
}
