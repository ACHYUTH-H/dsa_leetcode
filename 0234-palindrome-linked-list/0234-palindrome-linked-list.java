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
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null )
        return false;

        //first use slow and fast pointers and get the middle value 
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //now we have two postions and now we need to reverse the linked list and the first element will be next to slow
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next=curr;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //now the reversal of the linked list is done

        ListNode trav=head;
        ListNode trav2=prev;
        while( trav2!=null)
        {
            if(trav.val!=trav2.val)
            {
                return false;
            }
            trav=trav.next;
            trav2=trav2.next;
        }
    return true;
        
    }
}