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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
    ListNode dummy=new ListNode(-1);
    ListNode ans=dummy;

    ListNode ind1=l1;
    ListNode ind2=l2;

    int carry=0;

    while(ind1!=null || ind2!=null || carry!=0)
    {
        int val1=(ind1!=null)?ind1.val:0;
        int val2=(ind2!=null)?ind2.val:0;

        int sum=val1+val2+carry;

        int digit=sum%10;
        carry=sum/10;

        ans.next=new ListNode(digit);
        ans=ans.next;

        if(ind1!=null)
        ind1=ind1.next;
        if(ind2!=null)
        ind2=ind2.next;

    }
return dummy.next;

    }
}