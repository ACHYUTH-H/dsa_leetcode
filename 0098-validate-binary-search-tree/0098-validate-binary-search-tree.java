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



    public boolean validate(TreeNode root,long min,long max)
    {
        if(root==null) return true;
        //out of range
        if(root.val<=min||root.val>=max)
        {
            return false;
        }
        //leftsubtree should be always less thn the current
        boolean left= validate(root.left,min,root.val);
        boolean right= validate(root.right,root.val,max);
        return left & right;

    }

    public boolean isValidBST(TreeNode root) 
    {
        // if(root==null) return true;
        // if(root.left!=null && root.left.val>=root.val)
        // {
        //     return false;
        // }
        // if (root.right!=null && root.right.val<=root.val)
        // {
        //     return false;
        // }
        // return isValidBST(root.left)& isValidBST(root.right);


        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
        
    }
}