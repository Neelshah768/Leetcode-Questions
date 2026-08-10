/*

    104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100

 */

public class MaximumDepthofBinaryTree {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int Right = maxDepth(root.right);
        return Math.max(left,Right)+1;
    }
    public static void main() {
//        TreeNode root = new TreeNode(3);
//
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//
//        // root.left (9) has no children
//        root.left.left = null;
//        root.left.right = null;
//
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);


        TreeNode root = new TreeNode(1);

        root.left = null;
        root.right = new TreeNode(2);

        System.out.println(maxDepth(root));
    }
}
