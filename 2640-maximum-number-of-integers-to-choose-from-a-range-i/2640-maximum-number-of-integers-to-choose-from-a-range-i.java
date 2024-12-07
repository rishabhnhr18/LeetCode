class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        if (banned.length == 0 || maxSum == 0)
            return 0;
        Set<Integer> m = new HashSet<>();
        for (Integer i : banned)
            m.add(i);
        int sum = 0, res = 0;
        for (int i = 1; i <=n; i++) {
            if (!m.contains(i)) {
                if ((sum + i) <= maxSum) {
                    sum += i;
                    res++;
                } else
                    return res;
            }
        }
        return res;
    }
}