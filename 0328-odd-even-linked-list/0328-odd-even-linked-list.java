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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next; // for adding evenhesd to end of the odd part
        while(even!=null && even.next!=null)
        {
            odd.next=even.next; // connecting the odd indice node with other odd indice after the even node
            odd=odd.next;   //moving the odd pointer to the newly add odd node 
            even.next=odd.next; // connecting the even indice node with other even indice node after the odd node
            even=even.next;  //moving the evenpointer to the newly add even node 
        } 
        odd.next=evenHead;
        return head;
    }
}