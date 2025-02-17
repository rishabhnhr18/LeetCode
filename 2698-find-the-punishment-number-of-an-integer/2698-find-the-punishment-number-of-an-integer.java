class Solution {
    public int punishmentNumber(int n) {
        if (n == 0)
            return 0;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int product = i * i;
            String s = String.valueOf(product);
            if (canPartition(s, i, 0, 0))
                res += product;
        }
        return res;
    }

    private boolean canPartition(String s, int target, int index, int currentSum) {
        if (index == s.length())
            return (currentSum == target);
        for (int i = index + 1; i <= s.length(); i++) {
            int num = Integer.parseInt(s.substring(index, i));
            if (currentSum + num > target)
                break;
            if (canPartition(s, target, i, currentSum + num))
                return true;
        }
        return false;
    }
}