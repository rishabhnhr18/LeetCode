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
    public ListNode deleteMiddle(ListNode head) {
        
        /*approach 1 by finding number of elementing and then reaching to middle one
        // edge cases
        if (head == null)
            return head;
        if (head.next == null)
            return null;

        int n = 1;
        ListNode node = head;
        for (;node.next != null;node=node.next)
            n++;
                ListNode i=head;
                ListNode j=null;
                int x=0;
                while(x<(n/2))
                {
                    j=i;
                    i=i.next;
                    x++;
                }
                 j.next=i.next;
     
        return head;
        */
        

        //approach 2 by slow and fast, 2 pointer approach
        if(head==null || head.next==null) return null;

        ListNode slow=head, fast=head;
        ListNode previous=null;
        for(;fast!=null && fast.next!=null; fast=fast.next.next, slow=slow.next) previous=slow;  // fast moving twice more than slow, so when fast end slow will be at middle

        //slow is at middle adjusting prevous next and slow next to elimante linkage of the middle element in the list

        previous.next=slow.next;        //element to which slow pointing to gets detached from list

        return head;  //return list
    }
}