/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        //understanding the problem now we have a linked list and we need to create a deep copy means copy of the linked list exact nodes to another linkedlist 
        //the problem just lies in random pointers because u cannot assign a node to any other random node which u have not seen
        //approach is to traverse two times 
        //first : put that in hashmap
        if(head==null)
        {
            return head;
        }
        
        HashMap<Node,Node>map=new HashMap<>();
        Node curr=head;
        while(curr!=null)
        {
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        //for every node as a key we are putting new node as value with same data 
        curr=head;
        while(curr!=null)
        {
            Node temp=map.get(curr);
            temp.next=map.get(curr.next);
            temp.random=map.get(curr.random);
            curr=curr.next;
        }
    return map.get(head);
    }
}