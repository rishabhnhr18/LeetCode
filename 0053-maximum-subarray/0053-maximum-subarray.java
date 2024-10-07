class Solution {
    public int maxSubArray(int[] nums) {
        int maximum=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            maximum=Math.max(sum, maximum);
            if(sum<0) sum=0;
        }
        return maximum;
    }
}