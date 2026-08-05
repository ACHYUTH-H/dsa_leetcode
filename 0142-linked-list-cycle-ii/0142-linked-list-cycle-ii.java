/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            //System.out.println("no cycle");
            return null;
        }
     //for detection of the cycle we have used two pointer approach 
     ListNode slow=head;
     ListNode fast= head;
     int loop=0;
    
     while(fast!=null && fast.next!=null)
     {
       
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            loop=1;
            break;
        }
     }   
        if(loop==0)
        {
            return null; 
        }
        else
        {
            ListNode curr=head;
            while(slow!=curr)
            {
                slow=slow.next;
                curr=curr.next;
            }
            return slow;
        }
        //return head;
    }
}