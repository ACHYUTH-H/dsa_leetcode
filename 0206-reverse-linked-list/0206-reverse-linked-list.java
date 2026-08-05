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
    public ListNode reverseList(ListNode head) 
    {
     //reversing the linked list we use three pointer approach 
     ListNode curr=head;
     ListNode prev=null;
     ListNode next=curr;
     while(curr!=null)
     {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }
     return prev;
    }
}