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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        /*
         * approach 1
         * StringBuilder str1=new StringBuilder();
         * StringBuilder str2=new StringBuilder();
         * 
         * for(ListNode node=l1; node!=null ; node=node.next) str1.append(node.val);
         * for(ListNode node=l2; node!=null ; node=node.next) str2.append(node.val);
         * long sum=0;
         * try
         * {
         * sum=Long.parseLong(str1.reverse().toString())+Long.parseLong(str2.reverse().
         * toString());
         * }catch(NumberFormatException nfe)
         * {
         * System.out.println("Ok");
         * return null;
         * }
         * String s2=String.valueOf(sum);
         * ListNode l3=new ListNode(0);
         * ListNode current = l3;
         * for(int x=s2.length()-1; x>=0; x--)
         * {
         * current.next=new ListNode(Integer.parseInt(s2.substring(x,x+1)));
         * current=current.next;
         * }
         * return l3.next;
         */


         /* arrpach 2

            if(l1==null || l2==null) return null;

        int sum=0, carry=0;
        for(ListNode node1=l1, node2=l2; node1!=null || node2!=null ; node1=node1.next, node2=node2.next)
        {
            if(node1!=null) sum+=node1.val;
            if(node2!=null) sum+=node2.val;
            carry=sum%10;
            sum+=carry;
        }
        StringBuilder str=new StringBuilder(sum);
        str=str.reverse();
        ListNode l3=new ListNode();
        ListNode curr=l3;
        for(int x=0; x<str.length(); x++)
        {
            curr.next=new ListNode(str.charAt(x));
            curr=curr.next;
        }
        return l3.next;
        */

        // aprroach 3
        if(l1==null || l2==null) return null;
        ListNode l3=new ListNode(), current = l3;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int sum=carry;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
        }
        return l3.next;
    }
}