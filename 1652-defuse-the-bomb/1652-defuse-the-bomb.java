class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        if (k == 0)
            return ans;
        int[] prefix = new int[code.length * 2];
        prefix[0] = code[0];
        for (int i = 1; i < prefix.length; i++)
            prefix[i] = prefix[i - 1] + code[i % n];
        calculate(prefix, k, ans);
        return ans;
    }

    private void calculate(int[] prefix, int k, int[] ans) {
        int n = ans.length;
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                ans[i] = prefix[i + k] - prefix[i];
            }
        } else {
            k *= -1;
            for (int i = n ; i < 2*n; i++) {
                ans[i-n] = prefix[i-1] - prefix[i - k - 1];
            }
        }
    }
}