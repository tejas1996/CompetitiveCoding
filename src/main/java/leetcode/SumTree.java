package leetcode;

public class SumTree {
    public static void main(String[] args) {


        TreeNode root = formTree();
        bstToGst(root);

    }

    public static TreeNode bstToGst(TreeNode node) {

        helper(node, 0);
        System.out.println("root");

        return node;

    }

    private static int helper(TreeNode node, int sum) {

        if (node.left == null && node.right == null) {
            int temp = node.val;
            node.val = node.val + sum;
            return temp;
        }
        int temp = node.val;
        int right = 0, left = 0;
        if (node.right != null) {
            right = helper(node.right, sum);
        }
        node.val = node.val + right + sum;
        if (node.left != null) {
            left = helper(node.left, node.val);
        }
        return temp + left + right;
    }

    private static TreeNode formTree() {

        TreeNode four = new TreeNode(4);
        TreeNode six = new TreeNode(6);
        TreeNode five = new TreeNode(5);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode one = new TreeNode(1);
        TreeNode zero = new TreeNode(0);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        four.right = six;
        six.left = five;
        six.right = seven;
        seven.right = eight;
        four.left = one;
        one.right = two;
        two.right = three;
        one.left = zero;

        return four;
    }
}
