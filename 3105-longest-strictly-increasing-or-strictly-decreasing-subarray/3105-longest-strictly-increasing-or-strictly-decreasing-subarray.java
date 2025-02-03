class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incCount = 0;
        int decCount = 0;
        int count = 1;
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i])
                count++;
            else {
                incCount = Math.max(incCount, count);
                count = 1;
            }
        }

        incCount = Math.max(incCount, count);
        count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i])
                count++;
            else {
                decCount = Math.max(decCount, count);
                count = 1;
            }
        }

        decCount = Math.max(decCount, count);
        return Math.max(incCount, decCount);
    }
}