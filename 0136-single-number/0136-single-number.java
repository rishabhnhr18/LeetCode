class Solution {
    private int XOR;
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++) this.XOR=this.XOR^nums[i];
        return XOR;
        
    }
}