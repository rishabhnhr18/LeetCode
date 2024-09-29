class Solution {
public:
    bool check(vector<int>& nums) {
        vector<int> v(nums);
        sort(v.begin(), v.end());
        int d=(v.size())-1;
        if(nums.size()==1) return true;  //already sorted
        if(nums.size()==0) return false; // empty
        for(int i=1; i<=d; i++)
        {   
                if(nums==v) return true;
                int temp=nums[0];
                for(int i=1; i<=d; i++) nums[i-1]=nums[i];
                nums[nums.size()-1]=temp;    
                for(auto iter: nums) cout<<iter<<" ";
                cout<<endl;     
                if(nums==v) return true;
        }
        return false;
      }

};