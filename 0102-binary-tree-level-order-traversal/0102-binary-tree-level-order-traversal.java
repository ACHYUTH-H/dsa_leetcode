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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
    //level order is also called as the bfs breadth first search
    //wkt we need to use queue for the bfs
  
    List<List<Integer>>ans= new ArrayList<>();
      if(root==null) return ans;
    Queue<TreeNode>q= new LinkedList<>();
    q.add(root);
    q.add(null);
    List<Integer>temp= new ArrayList<>();
    while(!q.isEmpty())
    {
        
        TreeNode curr=q.remove();
        if(curr==null)
        {
            // ans.add(new ArrayList<>())
            ans.add(new ArrayList<>(temp));
            temp=new ArrayList<>();
            if(q.isEmpty())
            break;
            else
            q.add(null);     
        }
        else
        {
            temp.add(curr.val);
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!= null)
            {
                q.add(curr.right);
            }
        }
    }
    return ans ;
    }
}