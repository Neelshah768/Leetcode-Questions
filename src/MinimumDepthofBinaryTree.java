/*

111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

xample 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000

 */



public class MinimumDepthofBinaryTree {

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
     public static int height(TreeNode root){
          if(root == null){
              return  0;
          }

          return Math.max(height(root.left),height(root.right))+1;
     }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if (root.left == null){
            int left = height(root.right);
            return left+1;
        }
        if(root.right == null){
            int right = height(root.left);
            return right+1;
        }

        return Math.min(height(root.left),height(root.right))+1;

    }

    public static void main() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

//        TreeNode root = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(4);
//        root.right.right.right = new TreeNode(5);
//        root.right.right.right.right = new TreeNode(6);

        System.out.println(minDepth(root));
    }
}
