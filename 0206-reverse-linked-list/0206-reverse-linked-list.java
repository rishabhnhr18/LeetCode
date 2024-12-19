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
    public ListNode reverseList(ListNode head) {
        /* approach 1 correct
        ListNode prev=null;
        ListNode curr=head;
        if(head==null) return null;
        if(head.next==null) return head;
        while(curr!=null)
        {
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
    return prev;
    */

    //approach 2
    if (head==null || head.next==null) return head;
    ListNode node=head, prev=null, front=null;

    while(node!=null)
    {
        front = node.next;
        node.next=prev;
        prev=node;
        node=front;
    }
    return prev;
    }
}