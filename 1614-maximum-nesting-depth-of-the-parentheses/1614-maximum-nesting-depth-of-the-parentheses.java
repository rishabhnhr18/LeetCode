class Solution {
    public int maxDepth(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int count = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                count++;
            else if (c == ')')
                count--;
            max = Math.max(max, count);
        }
        return max;
    }
}