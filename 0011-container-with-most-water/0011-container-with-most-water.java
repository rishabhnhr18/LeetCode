class Solution {
    public int maxArea(int[] height) {
/*
            Approach1 (Wrong giving TLE)

        if(height==null || height.length==0) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<height.length-1; i++)
        {
            for(int j=i+1; j<height.length; j++)
            {
                int length= Math.min(height[i], height[j]);
                int width=j-i;
                int area=length*width;
                max=Math.max(max, area);
            }
        }
        return max;
        */

        // approach 2
        if(height==null || height.length==0) return 0;
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            int width=right-left;
            int length=Math.min(height[left], height[right]);
            int area=width*length;
            max=Math.max(max, area);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}