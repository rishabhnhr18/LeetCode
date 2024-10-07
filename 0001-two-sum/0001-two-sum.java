class Solution {
    private HashMap<Integer, Integer> m=new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++)
        {
            int req=target-nums[i];
            if(m.containsKey(req)) return new int[]{i, m.get(req)};
            else m.put(nums[i],i);
        }
    return new int[]{};
    }
    }