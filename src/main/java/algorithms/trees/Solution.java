package algorithms.trees;


// link to the problem - https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

class Solution {

    public static void main(String[] args) {
        int[] pre = {4, 10, 7, 9, 11};
        TreeNode ans = bstFromPreorder(pre);
        System.out.println("done");
    }

    public static TreeNode bstFromPreorder(int[] preorder) {

        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder[1] < preorder[0]) {
            TreeNode lrf = new TreeNode(preorder[1]);
            root.left = lrf;
            int ret = doTheThing(root.left, 2, preorder, root.val);

            if (ret == -1) {
                return root;
            } else {
                root.right = new TreeNode(ret);
                int index = -1;
                for (int i = 0; i < preorder.length; i++) {
                    if (preorder[i] == ret) {
                        index = i;
                    }
                }
                doTheThing(root.right, index + 1, preorder, Integer.MAX_VALUE);

            }
        } else {
            TreeNode right = new TreeNode(preorder[1]);
            root.right = right;
            doTheThing(root.right, 2, preorder, Integer.MAX_VALUE);
        }


        return root;

    }

    public static int doTheThing(TreeNode node, int n, int[] preorder, int max) {

        if (n >= preorder.length) {
            return -1;
        }
        int ret = -1;
        if (preorder[n] < node.val) {
            node.left = new TreeNode(preorder[n]);
            ret = doTheThing(node.left, n + 1, preorder, preorder[n - 1]);
        }

        if (preorder[n] > node.val && preorder[n] < max) {
            node.right = new TreeNode(preorder[n]);
            ret = doTheThing(node.right, n + 1, preorder, max);
        }
        if (preorder[n] > max) {
            return preorder[n];
        }

        while (ret != -1) {

            if (ret > max) {
                return ret;
            } else {
                int index = 0;
                for (int i = 0; i < preorder.length; i++) {
                    if (preorder[i] == ret) {
                        index = i;
                        break;
                    }
                }
                node.right = new TreeNode(preorder[index]);
                int retn = doTheThing(node.right, index + 1, preorder, max);
                if (retn > max) {
                    return retn;
                } else {
                    ret = retn;
                    continue;
                }

            }
        }

        return -1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}