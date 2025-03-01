class Solution {
    public int[] applyOperations(int[] nums) {
        /*
         * If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to
         * 0. Otherwise, you skip this operation.
         */

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
            continue; // skipping operation
        }
        int newArray[] = new int[nums.length];
        int newArrayIndex = 0;
        for (int element : nums) {
            if (element != 0) {
                newArray[newArrayIndex] = element;
                newArrayIndex++;
            }
        }
        return newArray;
    }
}
