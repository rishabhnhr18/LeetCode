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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        ListNode i= list1;
        ListNode j=list2;
        ListNode dummy=new ListNode();
        ListNode res=dummy;
        while(i!=null && j!=null)
        {
            if(i.val<j.val)
            {
                res.next=new ListNode(i.val);
                i=i.next;
            }
            else
            {
                res.next=new ListNode(j.val);
                j=j.next;
            }
            res=res.next;
        }
        while(i!=null)
        {
                res.next=new ListNode(i.val);
                i=i.next;
                res=res.next;            
        }
                while(j!=null)
        {
                res.next=new ListNode(j.val);
                j=j.next;
                res=res.next;            
        }
        return dummy.next;
    }
}