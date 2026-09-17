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
 class TreeInfo 
 {
    int ht;
    int diam;
    TreeInfo (int ht,int diam)
    {
        this.ht=ht;
        this.diam=diam;
    }
 }
class Solution {
    public TreeInfo diam (TreeNode root)
    {
        if(root==null) return new TreeInfo(0,0);
        TreeInfo left=diam(root.left);
        TreeInfo right= diam(root.right);

        int myHeight=Math.max(left.ht,right.ht)+1;
        int diam1= left.diam;
        int diam2= right.diam;
        int diam3= left.ht+right.ht;
        int myDiam=Math.max(diam1,Math.max(diam2,diam3));
        return new TreeInfo(myHeight,myDiam);
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
        TreeInfo ans= diam(root);
        return ans.diam;
    }
}