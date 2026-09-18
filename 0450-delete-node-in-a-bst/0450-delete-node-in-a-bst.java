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
    public TreeNode inorder(TreeNode root)
    {
            while(root != null &&root.left!=null)
            {
                root=root.left;
            }
            return root;
    }





    public TreeNode deleteNode(TreeNode root, int key) 
    {
    //for every recursion we need to assign the subtree returned to the correct node
    if (root==null)
    {
        return null;
    }
    if(key<root.val)
    {
        root.left=deleteNode(root.left,key);
    }
    else if (key>root.val)
    {
        root.right=deleteNode(root.right,key);
    }
    else
    {
        //we are at the position of the node where we need to delete those
        //3 cases
        //case 1: leaf node;
        if(root.left==null && root.right==null)
        {
            return null;
        }
        //case 2: node with single child
        if(root.left==null)
        {
            return root.right;
        }
        else if (root.right==null)
        {
            return root.left;
        }
        //case 3: both the children are present so we need inorder successor
        else
        {
            TreeNode next= inorder(root.right);
            root.val= next.val;
            root.right= deleteNode(root.right,next.val);
        }

    }
    return root;
    }
}