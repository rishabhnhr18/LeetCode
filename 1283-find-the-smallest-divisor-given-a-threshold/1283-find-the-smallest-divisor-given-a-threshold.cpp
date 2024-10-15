class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int low=1;
        int high=*std::max_element(nums.begin(), nums.end());
        int mini=high;
        while(low<=high)
        {
            int ans=0;
            int mid=(low+high)/2;
            for(int i=0; i<nums.size(); i++) ans+=ceil((double)nums[i]/(double)mid);
            if(ans<=threshold)  high=mid-1;
            else low=mid+1;
        }
        return low;
    }
};