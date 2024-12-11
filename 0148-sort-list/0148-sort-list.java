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
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        // brute force approach
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        Map<Integer, Integer> map = new TreeMap<>();
        for (ListNode node = head; node != null; node = node.next)
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);

        for (int i : map.keySet()) {
            int x = 1;
            while (x <= map.get(i)) {
                current.next = new ListNode(i);
                current = current.next;
                x++;
            }
        }
        return dummy.next;

    }
}