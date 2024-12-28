class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0) return 0;
        int i=0, index=0;
       for(;i<nums.length; i++)
       {
        if(nums[i]!=val)
        {
            nums[index]=nums[i];
            index++;
        }
        else continue;
       }
       return index;
    }
}