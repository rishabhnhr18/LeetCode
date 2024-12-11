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
    public ListNode sortList(ListNode head) {
        /*
        if (head == null)
            return null;
        if (head.next == null)
            return head;
         * // brute force approach
         * ListNode dummy = new ListNode(0);
         * ListNode current = dummy;
         * Map<Integer, Integer> map = new TreeMap<>();
         * for (ListNode node = head; node != null; node = node.next)
         * map.put(node.val, map.getOrDefault(node.val, 0) + 1);
         * 
         * for (int i : map.keySet()) {
         * int x = 1;
         * while (x <= map.get(i)) {
         * current.next = new ListNode(i);
         * current = current.next;
         * x++;
         * }
         * }
         * return dummy.next;
         */
        // --------------------------------------------------------------------
        // using divide and merge technique

        if (head == null || head.next == null)
            return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode previous=null;        
        while (fast != null && fast.next != null) // loop to find middle element
        {
            previous=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next=null; //disconnecting left and right halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // merge logic
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next =right;
                right = right.next;
            }
            current = current.next;
        }

        while (left != null) {
            current.next = left;
            left = left.next;
            current = current.next;

        }
        while (right != null) {
            current.next = right;
            right = right.next;
            current = current.next;

        }
        return dummy.next;
    }
}