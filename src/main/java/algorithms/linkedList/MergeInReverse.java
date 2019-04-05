package algorithms.linkedList;

public class MergeInReverse {
    public static void main(String[] args) {
        Node root1 = formLinkedList();
        Node root2 = formLinkedList2();
        Node ans = merge(root1, root2);
        System.out.println("done");
    }

    private static Node merge(Node root1, Node root2) {

        Node p1, p2;
        p1 = root1;
        p2 = root2;
        Node answer = null;

        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                Node tmep = p1.next;
                p1.next = answer;
                answer = p1;
                p1 = tmep;
            } else {
                Node tmep = p2.next;
                p2.next = answer;
                answer = p2;
                p2 = tmep;
            }
        }

        if (p1 == null) {
            while (p2.next != null) {
                Node tmep = p2.next;
                p2.next = answer;
                answer = p2;
                p2 = tmep;
            }
            p2.next = answer;
            answer = p2;
        }
        if (p2 == null) {
            while (p1.next != null) {
                Node tmep = p1.next;
                p1.next = answer;
                answer = p1;
                p1 = tmep;
            }
            p1.next = answer;
            answer = p1;
        }


        return answer;
    }

    public static Node formLinkedList() {

        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(20);
        root.next = two;
        two.next = three;
        return root;
    }

    public static Node formLinkedList2() {

        Node root = new Node(5);
        Node two = new Node(10);
        Node three = new Node(15);
        root.next = two;
        two.next = three;
        return root;
    }
}
