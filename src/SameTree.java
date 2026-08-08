/*

100. Same Tree

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false


Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104




 */



public class SameTree {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q== null){
            return p == q;
        }

        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);

        return left && right && p.val==q.val;


    }

    public static void main(String[] args) {
//        TreeNode node1 = new TreeNode(1);
//        node1.left = new TreeNode(2);
//        node1.right = new TreeNode(3);
//
//        TreeNode node2 = new TreeNode(1);
//        node1.left = new TreeNode(2);
//        node1.right = new TreeNode(3);

//        TreeNode node1 = new TreeNode(1);
//        node1.left = new TreeNode(2);
//        node1.right = null;
//
//        TreeNode node2 = new TreeNode(1);
//        node2.left = null;
//        node2.right = new TreeNode(3);

        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.right = new TreeNode(1);

        TreeNode node2 = new TreeNode(1);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(2);

        System.out.println(isSameTree(node1,node2));
    }
}
