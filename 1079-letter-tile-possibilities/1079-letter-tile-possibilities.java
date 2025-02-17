class Solution {
    public int numTilePossibilities(String tiles) {
        if (tiles == null || tiles.length() == 0)
            return 0;
        if (tiles.length() == 1)
            return 1;
        int[] freq = new int[26];
        for (char c : tiles.toCharArray())
            freq[c - 'A']++;
        return findMaximumPosibilities(freq);
    }

    private int findMaximumPosibilities(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;
                freq[i]--;
                count += findMaximumPosibilities(freq);
                freq[i]++;
            }
        }
        return count;
    }
}