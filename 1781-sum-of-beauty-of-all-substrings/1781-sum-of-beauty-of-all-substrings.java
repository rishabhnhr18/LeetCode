class Solution {
    public int beautySum(String s) {
        if (s.isEmpty() || s.trim().isEmpty())
            return 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int val : map.values()) {
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }

                sum += (max - min);
            }
        }
        return sum;
    }
}