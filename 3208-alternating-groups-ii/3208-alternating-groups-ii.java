class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        if (colors == null || colors.length == 0 || k == 0)
            return 0;
        /*
         * Logic Flawed
         * int ans=0;
         * for(int i=0; i<colors.length; i++)
         * {
         * int j;
         * if(i==colors.length-1)j=0;
         * j=i;
         * int count = 1;
         * while (count <=k){
         * if(j==colors.length-1)
         * {
         * if(colors[j]==colors[0]) break;
         * j=0;
         * }
         * else if(j==colors.length)
         * {
         * if(colors[0] ==colors[1]) break;
         * j=1;
         * }
         * else
         * {
         * if(colors[j]==colors[j+1]) break;
         * }
         * j++;
         * count++;
         * }
         * if(count == k) ans++;
         * }
         * return ans;
         */

        /*
         * Apporach 2 TLE
         * int ans=0;
         * for (int i = 0; i < colors.length; i++) {
         * int j = (i+1) % colors.length;
         * int loopRuns = 1;
         * while (loopRuns < k) {
         * if (colors[j] == colors[(j+1) % colors.length])
         * break;
         * j = (j+1)%colors.length;
         * loopRuns++;
         * }
         * if(loopRuns == k) ans++;
         * }
         * 
         * return finalAns;
         */

        int left = 0;
        int ans = 0;
        int count = 1;
        int rightLimit = colors.length + k - 1;
        while (left < colors.length) {
            int right = left+1;
            while (right < rightLimit && (colors[(right - 1) % colors.length] != colors[right % colors.length]))
                right++;
            if (right - left >= k)
               ans += (right - left - k + 1);
            left = right;
        }
        return ans;
    }
}