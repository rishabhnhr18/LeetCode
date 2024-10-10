class Solution {
public:
map<int, int> m;
    bool search(vector<int>& nums, int target) {
        for(auto iter: nums) m[iter]++;
        if(m.find(target)==m.end()) return false;
        else return true;
    }
};