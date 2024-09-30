class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int m = 0;
        for (int i = 0; i <= nums.size(); i++) {
            bool found = false;
            for (int j = 0; j < nums.size(); j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
                }
                if (found == false) {
                    m = i;
                    break;
            }
        }
        return m;
    }
};