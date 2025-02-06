class Solution {
    public int tupleSameProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int val = nums[i] * nums[j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int n = entry.getValue();
                if(n>=2) count += (((n - 1) * n) / 2) * 8;
            }
        return count;

    }
}