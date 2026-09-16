/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }


    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null) return 0;
        int diam1=diameterOfBinaryTree(root.left);
        int diam2=diameterOfBinaryTree(root.right);
        int diam3=height(root.left)+height(root.right);
        return Math.max(diam3,Math.max(diam1,diam2));
    }
}