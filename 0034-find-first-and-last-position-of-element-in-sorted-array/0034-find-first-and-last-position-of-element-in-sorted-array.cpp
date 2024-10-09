class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> v;
        int front = -1;
        int back = -1;
        front = lower_bound(nums.begin(), nums.end(), target) - nums.begin();
        back =
            (upper_bound(nums.begin(), nums.end(), target) - nums.begin()) - 1;
        if (find(nums.begin(), nums.end(), target) != nums.end()) {
            v.clear();
            v.push_back(front);
            v.push_back(back);
        } else {
            v.push_back(-1);
            v.push_back(-1);
        }
        return v;
    }
};