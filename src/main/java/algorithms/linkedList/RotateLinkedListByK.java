package algorithms.linkedList;

import javax.print.attribute.standard.NumberUp;
import javax.xml.bind.annotation.XmlElementDecl;

public class RotateLinkedListByK {

    static Node store = null;
    static int globLK = 0;

    public static void main(String[] args) {

        int k = 3;
        globLK = k;
        Node root = formLinkedList();
        Node ans = rotateByK(root, k);
        System.out.println("done");
    }

    private static Node rotateByK(Node node, int k) {

        Node remem = node;
        for (int i = 0; i < k - 1; i++) {
            remem = remem.next;
        }
        Node current = null, prev, next;
        current = node;
        prev = null;
        while (current.next != null) {
            k = globLK;
            Node head = current;
            while (current.next != null && k > 0) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                k--;
            }
            if (current.next == null) {
                current.next = prev;
                break;
            }
            head = prev;
            prev = head;
        }

        System.out.println("done");
        return remem;

    }

    // I quit here man, too complicated by this method

    public static Node formLinkedList() {

        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node ix = new Node(7);
        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
//        six.next = ix;
        return root;
    }
}
