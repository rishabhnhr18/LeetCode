class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        int low = *std::max_element(nums.begin(), nums.end());
        int high = std::accumulate(nums.begin(), nums.end(), 0);
        int mini = high;
        int count, sum;
        while (low <= high) {
            count = 1, sum = 0;
            int mid = (low + high) / 2;
            for (int i = 0; i < nums.size(); i++) {
                if (sum + nums[i] <= mid)
                    sum += nums[i];
                else {
                    count += 1;
                    sum = nums[i];
                }
            }
            if (count > k)
                low = mid + 1;
            else{
                high = mid - 1;           
            }
        }
        return low;  
    }
};