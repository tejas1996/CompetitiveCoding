package algorithms.trees;

import java.util.Arrays;

public class FormBST {
    public static void main(String[] args) {

        int[] array = {15, 10, 7, 8, 29, 12};
        Arrays.sort(array);

        Node node = formBST(array, 0, array.length - 1);
        System.out.println(node.value);
    }

    private static Node formBST(int[] array, int start, int end) {

        if (start < 0 || end >= array.length) {
            return null;
        }
        int index = (end - start) / 2;

        if (start == end) {
            Node node1 = new Node(array[start]);
            return node1;
        }
        Node node = new Node(array[start + index]);
        if (index == 0) {
            node.left = null;
        } else {
            node.left = formBST(array, start, start + index - 1);
        }
        if (index == end) {
            node.right = null;
        } else {
            node.right = formBST(array, start + index + 1, end);
        }

        return node;
    }
}
