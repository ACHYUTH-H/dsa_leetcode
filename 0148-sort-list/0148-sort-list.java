/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//slow is where we return the node which is middle
    }

    public ListNode merge(ListNode left,ListNode right)
    {
        ListNode dummy=new ListNode(-1,null);
        ListNode temp=dummy;
        while(left!=null && right !=null)
        {
            if(left.val>right.val)
            {
                temp.next=right;
                right=right.next;
            }
            else
            {
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
        }
        if(left!=null)
        {
            temp.next=left;
        }
        else
        {
            temp.next=right;
        }
        return dummy.next;

    }


    public ListNode mergesort(ListNode head)
    {
        //now if the linked list is empty return empty
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode mid=middle(head);
        ListNode leftp=head;
        ListNode rightp=mid.next;
        mid.next=null;
        leftp=mergesort(leftp);
        rightp=mergesort(rightp);
        return merge(leftp,rightp);



    }



    public ListNode sortList(ListNode head) 
    {
    //first send this to other function where u can find the mid value and do recursion
    ListNode merged= mergesort(head);   
    return merged; 
    }
}