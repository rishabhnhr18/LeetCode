# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:

        #creating a dummy node
        dummy = ListNode(0)
        dummy.next= head
        prev, curr = dummy, head
        nums_set = set(nums)
        #iterate using prev and curr pointer

        while curr:
            if curr.val in nums_set:
                prev.next = curr.next
            else:
                prev = curr
            curr = curr.next 
        return dummy.next
        