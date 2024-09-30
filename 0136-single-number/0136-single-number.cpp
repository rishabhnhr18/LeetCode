class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int singleNo=0;
        map<int , int> m;
        for(auto iter: nums) m[iter]++;
        for(auto iter: m) if(iter.second==1) 
        {
            singleNo=iter.first;
        }
        return singleNo;
    }
};