/*

94. Binary Tree Inorder Traversal

Given the root of a binary tree, return the inorder traversal of its nodes' values.



Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]



Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
    }}

    public static void DFS(TreeNode root, ArrayList list){
        if(root == null){
            return;
        }

        DFS(root.left,list);
        list.add(root.val);
        DFS(root.right,list);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList list = new ArrayList();

        DFS(root,list);
        return list;
    }
    public static void main(String[] args) {

      TreeNode root = new TreeNode(1);
      root.left = null;
      root.right = new TreeNode(2);
      root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));

    }

}
