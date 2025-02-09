
// Condition to Check -> i<j && j-i!= nums[j]- nums[i]
class Solution {
    public long countBadPairs(int[] nums) {
        if(nums==null || nums.length<=1) return 0;
        if(nums.length==2)  //only two elements
        {
            if(nums[1]-nums[0]!=1) return 1;
        }
        int count=0;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j= i+1; j<nums.length; j++)
            {
                if(i<j)
                {
                    if((j-i)!=nums[j]-nums[i]) count++;
                }
            }
        }
        return count;
    }
}