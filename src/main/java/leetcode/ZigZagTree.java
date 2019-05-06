package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZigZagTree {
    public static void main(String[] args) {

        TreeNode root = formTree();
        List<List<Integer>> ans = zigzagLevelOrder(root);
        System.out.println("done");

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        TreeNode dummy = new TreeNode(-1);
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.addFirst(root);
        dq.addLast(dummy);
        boolean flag = false;
        List<List<Integer>> ans = new ArrayList<>();
        while (!dq.isEmpty()) {
            if (!flag) {
                List<Integer> add = new ArrayList<>();
                TreeNode current = dq.pollFirst();
                while (current != dummy) {
                    if (current.left != null) {
                        dq.addLast(current.left);
                    }
                    if (current.right != null) {
                        dq.addLast(current.right);
                    }
                    add.add(current.val);
                    current = dq.pollFirst();
                }
                ans.add(add);
                dq.addFirst(dummy);
            } else {
                List<Integer> add = new ArrayList<>();
                TreeNode current = dq.pollLast();
                while (current != dummy) {
                    if (current.right != null) {
                        dq.addFirst(current.right);
                    }
                    if (current.left != null) {
                        dq.addFirst(current.left);
                    }
                    add.add(current.val);
                    current = dq.pollLast();
                }
                ans.add(add);
                dq.addLast(dummy);
            }
            flag = !flag;
            if (dq.size() == 1) {
                dq.pollFirst();
            }

        }
        return ans;
    }

    private static TreeNode formTree() {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;
        seven.right = eight;

        return one;
    }
}
