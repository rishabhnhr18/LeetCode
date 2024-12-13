/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        /*
         * approach 1
         * Map<ListNode, ListNode> map1=new HashMap<>();
         * Map<ListNode, ListNode> map2=new HashMap<>();
         * ListNode nodeA=new ListNode(0);
         * nodeA.next=headA;
         * ListNode nodeB=new ListNode(0);
         * nodeB.next=headB;
         * for(int x=1; nodeA!=null; nodeA=nodeA.next, x++) map1.put(nodeA,nodeA.next);
         * for(int y=1; nodeB!=null; y++, nodeB=nodeB.next) map2.put(nodeB, nodeB.next);
         * for(ListNode node: map1.keySet())
         * {
         * if(map2.containsKey(node) && map1.get(node)==map2.get(node)) return node;
         * }
         * return null;
         */
        // apporach 2
        for(ListNode nodeA=headA; nodeA!=null ; nodeA=nodeA.next)
        {
            for(ListNode nodeB=headB; nodeB!=null; nodeB=nodeB.next)
            {
                if(nodeA==nodeB) return nodeA;
            }
        }
        return null;
    }
}