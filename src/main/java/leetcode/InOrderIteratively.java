package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

// Problem link - https://leetcode.com/problems/binary-tree-inorder-traversal/
public class InOrderIteratively {

    public static void main(String[] args) {

        TreeNode treeNode = formTree();

        inOrderTraversal(treeNode);

    }

    private static void inOrderTraversal(TreeNode treeNode) {

        LinkedList<TreeNode> stack = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        TreeNode node = treeNode;
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (visited.contains(current)) {
                System.out.print(current.val + " ");
            } else {
                if (current.left == null && current.right == null) {
                    visited.add(current);
                    System.out.print(current.val + " ");
                } else {
                    if (current.right != null) {
                        stack.push(current.right);
                    }
                    stack.push(current);
                    if (current.left != null) {
                        stack.push(current.left);
                    }
                    visited.add(current);
                }
            }

        }

    }

    private static TreeNode formTree() {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;

        return one;
    }
}
