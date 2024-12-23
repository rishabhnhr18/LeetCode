class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==0) return false;
        int i=0, maxi=0;
        for(int step: nums)
        {
            if(i>maxi) return false;
            maxi=Math.max(maxi, i+step);
            i++;
        }
        return maxi>=nums.length-1;
    }
}