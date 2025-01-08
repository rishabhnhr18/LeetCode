class Solution {
    private boolean isPrefixAndSuffix(String s1, String s2) {
        return s1.startsWith(s2) && s1.endsWith(s2);
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