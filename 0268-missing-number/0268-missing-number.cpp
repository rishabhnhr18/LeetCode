class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int mE=0;
        vector<int> hashVector(nums.size()+1, 0);
        hashVector[nums[0]]=1;
        for(int i=1; i<nums.size(); ++i) hashVector[nums[i]]=1;
        mE=0;
        for(auto iter: hashVector)
        {
            if(iter==0) return mE;
            mE++;
        }    
        return mE;    
    }
};