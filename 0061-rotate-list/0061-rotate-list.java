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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null||head.next==null)
        {
            return head;
        }

        //now we need to find n to get k
        
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
    k=k%n;
    ListNode curr=head;
    while(k>0&& curr.next!=null)
    {
        curr=curr.next;
        k--;
    }    
    //now we have difference in the nodes to which we need to rotate
    ListNode last=head;
    while(curr.next!=null)
    {
        curr=curr.next;
        last=last.next;
    }
    curr.next=head;
    head=last.next;
    last.next=null;
    
    return head;
    }

}