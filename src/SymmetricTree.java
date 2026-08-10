/*
    101. Symmetric Tree

    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false


Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100


Follow up: Could you solve it both recursively and iteratively?

 */

public class SymmetricTree {

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

    public static boolean isSame(TreeNode Left, TreeNode Right){
        if(Left == null || Right == null){
            return Left == Right;
        }

        boolean leftValue = isSame(Left.left,Right.right);
        boolean rightValue = isSame(Left.right,Right.left);

        return leftValue && rightValue && Left.val == Right.val;
    }


    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isSame(root.left,root.right);
    }
    public static void main() {
//        TreeNode root = new TreeNode(1);
//
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        // root.left has no left child, only right child = 3
        root.left.left = null;
        root.left.right = new TreeNode(3);

        // root.right has no left child, only right child = 3
        root.right.left = null;
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));

    }
}
