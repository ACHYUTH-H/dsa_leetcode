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
    public List<Integer> pre(List<Integer>ans,TreeNode root)
    {
        if(root==null) return ans;

        ans.add(root.val);
         pre(ans,root.left);
         pre(ans,root.right);
        return ans;
    }




    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer>ans= new ArrayList<>();
        ans= pre(ans,root);
        return ans;    
    }
}