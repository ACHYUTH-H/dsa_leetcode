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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        int n = lists.length;
        PriorityQueue<ListNode>pq= new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        //here we are using the lambda operator becasue we need to define the sorting order for this
        for(ListNode node:lists)
        {
            if(node!= null)
            {
                pq.add(node);
            }
        } 
        ListNode dummy= new ListNode(0);
        ListNode tail= dummy;

        while(!pq.isEmpty())
        {
            ListNode curr= pq.poll();
            tail.next=curr;
            tail= tail.next;
            if(curr.next!=null)
            {
                pq.add(curr.next);
            }
        }
        return dummy.next;

    }
}