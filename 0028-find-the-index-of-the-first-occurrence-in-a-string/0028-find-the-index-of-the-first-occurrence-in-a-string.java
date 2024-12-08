class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle); // approach 1

        /*
         * approach 2
         * 
         * if(haystack.isEmpty() || needle.isEmpty() ||haystack.trim().isEmpty() ||
         * needle.trim().isEmpty()) return 0;
         * if(!haystack.contains(needle)) return -1;
         * int i=0;
         * while(i<haystack.length() && haystack.charAt(i)!=needle.charAt(0)) i++;
         * for(int j=0;i<haystack.length() && j<needle.length(); j++, i++)
         * {
         * if(needle.charAt(j)==haystack.charAt(i)) continue;
         * else break;
         * }
         * return i;
         */
    }
}