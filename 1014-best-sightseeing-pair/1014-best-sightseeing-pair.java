class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        /*
         * approach 1 (wrong)
         * //a[i]+i max
         * //a[j]-j min
         * int maxi=Integer.MIN_VALUE;
         * int mini=Integer.MAX_VALUE;
         * int ans=maxi;
         * int x=0;
         * for(int val: values)
         * {
         * maxi=Math.max(maxi, (val+x));
         * mini=Math.min(mini, (val-x));
         * ans=Math.max(ans,(maxi+mini));
         * x++;
         * }
         * return ans;
         */

        // approach 2
        if (values.length == 0)
            return 0;
        int first = values[0]; // initially first is at index 0;
        int maxi = Integer.MIN_VALUE;
        for (int j = 1; j < values.length; j++) // started searching from second index
        {
            maxi = Math.max(maxi, first + values[j] - j); // finding the maximum score
            first = Math.max(first, values[j] + j); // if the second index is larger than first index, so making it as
                                                    // first index to maximize the score
        }
        return maxi;
    }
}