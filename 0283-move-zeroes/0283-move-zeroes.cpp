class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int>::iterator i,j;
        for(j=nums.begin(); j!=nums.end(); ++j)
        {
            if(*(j)==0) break;
        }
        if(j==nums.end()) return;

        for(i=j+1; i!=nums.end(); i++)
        {
            if(*i!=0 &&*j==0)
            {
                swap(*i, *j);
                j++;
            }
        }
    }
};