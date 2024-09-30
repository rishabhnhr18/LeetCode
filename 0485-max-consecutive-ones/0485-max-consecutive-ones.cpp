class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0, maximum=0;
        for(auto iter: nums)
        {
            if(iter==1) count++;
            else count=0;
            if(count>maximum) maximum=count;
        }
        return maximum;
    }
};