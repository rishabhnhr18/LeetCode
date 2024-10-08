class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int pos=0, neg=1;
        vector<int> ans(nums.size(), 0);
        for(auto iter: nums)
        {
            if(iter<0)
            {
                ans[neg]=iter;
                neg+=2;
            }
            else
            {
                ans[pos]=iter;
                pos+=2;

            }
        }
        return ans;
    }
};