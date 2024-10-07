class Solution {
    private HashMap<Integer, Integer> m = new HashMap<>();

    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!m.containsKey(nums[i]))
                m.put(nums[i], 1);

            else {
                int v = m.get(nums[i]);
                m.put(nums[i], ++v);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iter = m.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Integer> m = iter.next();
            if (m.getValue() > ((nums.length) / 2))
                return m.getKey();
        }
        return -1;
    }

}