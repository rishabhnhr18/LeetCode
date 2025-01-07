class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     if(nums==null || nums.length==0) return new ArrayList<>();
        /*
        List<List<Integer>> ans=new ArrayList<>();
         for(int i=0; i<nums.length; i++)
         {
            for(int j=i+1; j<nums.length; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> res=new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        Collections.sort(res);
                        if(!ans.contains(res)) ans.add(res);
                    }
                }
            }
         }
        return ans;
        */
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else
                {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                }
            }
        }
        return ans;
    }
}