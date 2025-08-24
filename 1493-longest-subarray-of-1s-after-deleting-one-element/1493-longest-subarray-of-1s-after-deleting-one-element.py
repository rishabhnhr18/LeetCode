class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        left = 0
        right = 0
        deleted = False
        answer = 0
        index = -1
        while left<=right and right<len(nums):
            if nums[right] == 1:
                pass
            else:
                if not deleted:
                    deleted = True
                    index = right
                else:
                    left = index+1
                    index = right
                answer = max(answer, right-left+1)
            right+=1
        if deleted==False: return len(nums)-1
        else: return answer


        