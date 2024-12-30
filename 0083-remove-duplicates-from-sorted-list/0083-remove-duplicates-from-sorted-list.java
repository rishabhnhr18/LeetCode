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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        Set<Integer> s= new LinkedHashSet<>();
        ListNode res=new ListNode();
        ListNode dummy=res;
       for(ListNode node=head; node!=null ; node=node.next) s.add(node.val);
       for(int i: s)
       {
        res.next=new ListNode(i);
        res=res.next;
       }
       return dummy.next;
    }
}