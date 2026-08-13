/*

144. Binary Tree Preorder Traversal

Given the root of a binary tree, return the preorder traversal of its nodes' values.



Example 1:

Input: root = [1,null,2,3]

Output: [1,2,3]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [1,2,4,5,6,7,3,8,9]

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


 */


import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

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

    public static void DFS(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        DFS(root.left,list);

        DFS(root.right,list);
    }
    public static List<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList();

        DFS(root,list);
        return list;
    }
    public static void main() {
//        TreeNode root = new TreeNode(1);
//        root.left = null;
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = null;
        root.right.right = new TreeNode(8);

        root.left.left.left = null;
        root.left.left.right = null;

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right.left = new TreeNode(9);

        System.out.println(preorderTraversal(root));
    }
}
