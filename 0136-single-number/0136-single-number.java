class Solution {
    private int XOR;
    public int singleNumber(int[] nums) {
        for(int i: nums) XOR^=i;
        return XOR;
        
    }
}