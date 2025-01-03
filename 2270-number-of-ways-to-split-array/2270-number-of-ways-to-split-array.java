class Solution {
    public int waysToSplitArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        long [] prefix_sum=new long[nums.length+1];
        for(int i=0; i<nums.length; i++) prefix_sum[i+1]=prefix_sum[i]+nums[i];
        long total=prefix_sum[nums.length];
        int count=0;
        for(int split=1; split<=nums.length-1; split++)
        {
            if(prefix_sum[split]>=(total-prefix_sum[split])) count++;
        }
        return count;
    }
}