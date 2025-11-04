# class Solution:
#     def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
#         i = 0
#         return_response = []

#         while i <= len(nums) - k:
#             result = {}
#             for j in range (i, i+k):
#                 result[nums[j]] = result.get(nums[j], 0) + 1
            
#             desc_res = sorted(result.items(), key = lambda item: (-item[1], item[0]))
            
#             sub_arr = [num for num, _ in desc_res[:x]]
#             answer = sum(sub_arr)
            
#             i+=1
#             return_response.append(answer)
        
#         return return_response

            

class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        i = 0
        return_response = []

        while i <= len(nums) - k:
            result = {}
            for j in range(i, i + k):
                result[nums[j]] = result.get(nums[j], 0) + 1
            
            # Sort by frequency descending, then by value descending for tie-breaking
            desc_res = sorted(result.items(), key=lambda item: (-item[1], -item[0]))
            
            # Calculate sum of (value * frequency) for top x elements
            answer = 0
            for idx in range(min(x, len(desc_res))):
                value, freq = desc_res[idx]
                answer += value * freq
            
            return_response.append(answer)
            i += 1
        
        return return_response