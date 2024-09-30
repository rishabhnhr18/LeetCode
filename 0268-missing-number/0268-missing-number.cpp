class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sum2=0, sum1=(nums.size()*(nums.size()+1))/2;
        for(auto iter: nums) sum2+=iter;
        return abs(sum1-sum2);
        }
};