package algorithms.trees;

public class Node {

    public int value;
    Node left, right;
    public Node nexrRight;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object v) {
        boolean retVal = false;

        if (v instanceof Node) {
            Node ptr = (Node) v;
            retVal = ptr.value == this.value;
        }

        return retVal;
    }

}
