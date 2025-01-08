class Solution {
    private boolean isPrefixAndSuffix(String s2, String s1) {
        return s2.startsWith(s1) && s2.endsWith(s1);
    }

    public int countPrefixSuffixPairs(String[] words) {
        if (words == null || words.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (i != j) {
                    if (isPrefixAndSuffix(words[j], words[i]))
                        count++;
                }
            }
        }
        return count;
    }
}