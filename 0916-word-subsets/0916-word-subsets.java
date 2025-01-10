class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        if (words1 == null || words2 == null || words2.length == 0)
            return new ArrayList<>();
        int[] freq2 = new int[26];
        for (String s : words2) {
            int[] temp = new int[26];
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
                freq2[c - 'a'] = Math.max(freq2[c - 'a'], temp[c - 'a']);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String s : words1) {
            int[] freq1 = new int[26];
            for (char c : s.toCharArray()) {
                freq1[c - 'a']++;
            }
            if (isUniversal(freq1, freq2))
                ans.add(s);
        }
        return ans;
    }

    private boolean isUniversal(int[] freq1, int[] freq2) {
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] < freq2[i])
                return false;
        }
        return true;
    }
}