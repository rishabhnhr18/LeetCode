class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCount = new TreeMap<>();
        Map<Character, Integer> tCount = new TreeMap<>();
        if(s==null || t==null || s.length()!=t.length()) return false;
        int p=0;
        while(p<s.length())  // stroing the frequency of characters in both strings
        {
            sCount.put(s.charAt(p), sCount.getOrDefault(s.charAt(p), 0)+1);
            tCount.put(t.charAt(p), tCount.getOrDefault(t.charAt(p), 0)+1);
            p++;
        }
        if(!sCount.equals(tCount)) return false;  // checking if both maps are equal
        return true; // if both map have equal character in equal amount then they are anagrams of each other, hence return true.
    }

    /* Core Idea
    Store the count of each characters of strings in map
    check the euality of both maps
    if both maps are equal, then the strings are anagrams else not  
    */
}