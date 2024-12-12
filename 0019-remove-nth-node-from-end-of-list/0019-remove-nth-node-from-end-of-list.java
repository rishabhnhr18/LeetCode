/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode returnNode = new ListNode(0, head); // header of head node
        ListNode first  = returnNode;
        ListNode second=returnNode;
        if (head == null || head.next == null)
            return null;
        for (int i = 0; i < n; i++)
            first =first.next;
        while (first.next != null) {
            first= first.next;
            second= second.next;
        }
         if(second.next!=null)second.next = second.next.next;
        return returnNode.next;
    }
}