package algorithms.linkedList;

import java.util.Scanner;

public class RotateByK {

    public static void main(String[] args) {

        Node head = formLinkedList();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Node newHead = rotate(head, k);
        System.out.println("done");


    }

    private static Node rotate(Node head, int k) {

        Node temp = head;
        Node end = null;
        while (temp.next != null) {
            temp = temp.next;
        }
        end = temp;

        for (int i = 0; i < k; i++) {
            Node newstart = head.next;
            head.next = null;
            end.next = head;
            head = newstart;
            end = end.next;
        }
        return head;
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
//        five.next = six;
        return root;
    }


}
