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
    public ListNode sortList(ListNode head) 
    {
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode jai=head;
        while(jai!=null)
        {
            arr.add(jai.val);
            jai=jai.next;
        }
        //jai=null;
        int i=0;
        jai=head;
        Collections.sort(arr);
        while(i<arr.size())
        {
            jai.val=arr.get(i);
            jai=jai.next;
            i++;
        }
        return head;
    }
}