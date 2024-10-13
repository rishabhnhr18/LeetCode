class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)   // if there is only one element
            return 0;
        if (nums.length == 2) {     // if there are two element returing the max one 
            if (nums[0] > nums[1])
                return 0;
            else
                return 1;
        }
        if (nums[0] > nums[1])  //if 1st element is the peak
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])   // if last element is peak 
            return nums.length - 1;
        int low = 1;
        int high = nums.length - 2;
        while (low <= high) {           
            int mid = (low + high) / 2;
            if ((nums[mid] > nums[mid - 1]) && (nums[mid] > nums[mid + 1]))
                return mid;
            else if (nums[mid] > nums[mid - 1])  // increasing trend, peak would never be on left part
                low = mid + 1;
            else if (nums[mid] < nums[mid - 1])   // decreasing trend, peak would never be on right part
                high = mid - 1;
        }
        return -1;  // provided this would never occur
    }
}