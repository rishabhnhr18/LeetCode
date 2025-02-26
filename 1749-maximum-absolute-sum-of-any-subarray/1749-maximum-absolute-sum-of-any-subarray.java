class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int e : nums) {
            currentSum += e;
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0)
                currentSum = 0;
        }
        currentSum = 0;
        for (int e : nums) {
            currentSum += e;
            minSum = Math.min(currentSum, minSum);
            if (currentSum > 0)
                currentSum = 0;
        }
        return Math.max(maxSum, minSum * (-1));
    }
}