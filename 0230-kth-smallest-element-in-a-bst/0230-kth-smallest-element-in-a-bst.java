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
    int ans=0;
    int count=0;
    public void inorder(TreeNode root,ArrayList<Integer>list,int k)
    {
        if (root==null) return ;
        inorder(root.left,list,k);
        list.add(root.val);
        count++;
        if(count==k)
        {
            return;
        }
        inorder(root.right,list,k);
    }

    public int kthSmallest(TreeNode root, int k) 
    {
        //what if we do inorder traversal and get the value and print that same value
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list,k);
        return list.get(k-1);
    }
}