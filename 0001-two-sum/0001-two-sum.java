class Solution {
    public int [] index;
    private HashMap<Integer, Integer> m;
    public int[] twoSum(int[] nums, int target) {
        m=new HashMap<>();
        index= new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int x=target - nums[i];
            if(m.containsKey(x)==true)
            {
                index[0]=m.get(x);
                index[1]=i;
                break;
            }
            m.put(nums[i],i);
        }
        return index;
    }

}