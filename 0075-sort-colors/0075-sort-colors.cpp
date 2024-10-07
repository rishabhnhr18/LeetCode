class Solution {
public:
int low, mid, high;
    void sortColors(vector<int>& nums) {
        low=0;
        mid=0;
        high=nums.size()-1;
        while(mid<=high)
        {
            if(nums[mid]==1) mid++;
            else if(nums[mid]==0)
            {
                swap(nums[mid], nums[low]);
                mid++;
                low++;
            }
            else
            {
                swap(nums[mid], nums[high]);
                high--;
            }
    }
    }
};