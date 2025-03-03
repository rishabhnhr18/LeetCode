class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        if (nums == null || nums.length == 0)
            return new int[0];
/*
        Approach 1 wrong
        int e = 0;
        int f = nums.length-1;
        while (e < f) {
            while (e < nums.length && nums[e]<pivot)
                e++;
            while (f >= 0 && nums[f] >= pivot)
                f--;
            int temp = 0;
            if (e < f) {
                temp = nums[e];
                nums[e] = nums[f];
                nums[f] = temp;
            }
        }
        int i=0;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i]>= pivot) break;
        }
        return nums;
        */
        int index=0;
        int newArray[] = new int[nums.length];
        for(int element: nums)
        {
            if(element< pivot)
            {
                newArray[index]=element;
                index++;
            }
        }
        for(int element: nums)
        {
            if(element==pivot)
            {
                newArray[index]=element;
                index++;
            }
        }
        for(int element: nums)
        {
            if(element>pivot)
            {
                newArray[index]=element;
                index++;
            }
        }
        return newArray;

    }
}