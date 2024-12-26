class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
         * Approach 1
         * if (s.length() == 0)
         * return 0;
         * Stack<Character> stk = new Stack<>();
         * int count = 0;
         * int i = 0;
         * for (char c : s.toCharArray()) {
         * if (i == 0)
         * count++;
         * else {
         * if (stk.peek() == c) {
         * count = 0;
         * while (!stk.isEmpty())
         * stk.pop();
         * } else {
         * stk.push(c);
         * count++;
         * }
         * }
         * }
         * return count;
         */

        /*
         * Approach 2
         * 
         * if (s.length() == 0)
         * return 0; // egde case
         * int count = 1, maxi = 1;
         * int i = 0, j = 1;
         * while (j < s.length() && i < j) {
         * if(s.charAt(i)!=s.charAt(j))
         * {
         * count++;
         * maxi=Math.max(count, maxi);
         * j++;
         * }
         * else
         * {
         * i++;
         * j=i+1;
         * count=1;
         * }
         * }
         * return maxi;
         */

        // appraoch 3

        if (s == null || s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int i = 0, maxi=0;
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxi=Math.max(maxi, j-i+1);
        }
        return maxi;
    }
}