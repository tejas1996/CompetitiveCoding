package algorithms.linkedList;

public class ReorderList {

    static Node mem;

    public static void main(String[] args) {

        Node root = formLinkedList();
        mem = root;
        reorderList(root);
        System.out.println("done");


    }

    private static void reorderList(Node node) {

        if (node.next != null) {
            reorderList(node.next);
        }

        if (node == mem) {
            return;
        }

        Node temp = mem.next;
        mem.next = node;
        if (node == temp) {
            return;
        }
        node.next = temp;
        mem = temp;

        if (mem == node) {
            return;
        }


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
//        five.next = two;
        five.next = six;
        return root;
    }
}
