class Solution {
public:
    int func(vector<int> no, int low, int high, int target) {
        if (low > high)
            return low;
        int mid = (low + high) / 2;
        if(target==no[mid]) return mid;
        else if (target > no[mid]) return func(no, (mid + 1), high, target);
        else return func(no, low, (mid - 1), target);
    }
    int searchInsert(vector<int>& nums, int target) {
        return func(nums, 0, nums.size() - 1, target);
    }
};