class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        new_list = []
        for num in range(0,len(nums)):
            new_list.append(nums[nums[num]])
        return new_list