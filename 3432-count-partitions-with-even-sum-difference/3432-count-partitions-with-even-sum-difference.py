class Solution:

    def countPartitions(self, nums: List[int]) -> int:
        count = 0
        tmp_list_added = []
        tmp_list_removing = list(nums)
        for num in nums:
            tmp_list_added.append(num)
            tmp_list_removing.remove(num)
            if len(tmp_list_removing) == 0:
                break
            if (( sum(tmp_list_removing)) - sum(tmp_list_added)) %2 == 0:
                count+=1

        return count

            
        
        