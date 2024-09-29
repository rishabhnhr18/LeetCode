class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k=k%nums.size();
        vector<int> v(nums.size());
        vector<int> temp(k);
        vector<int>::reverse_iterator riter;
        if (k > 0 && nums.size() > 1) {
            int i = 0, j;
            for (i = 0, riter = nums.rbegin(); riter != nums.rend();
                 i++, ++riter)
                v[i] = *riter;

            for (auto iter : v)
                cout << iter << " ";
            cout << endl;

            // login of left k rotations
            for (int i = 0; i < k; i++)
                temp[i] = v[i];
            for (int i = k; i < v.size(); i++)
                v[i - k] = v[i];
            for (j = 0, i = v.size() - k; i < v.size(); j++, i++)
                v[i] = temp[j];

            for (i = 0, riter = v.rbegin(); riter != v.rend(); i++, ++riter)
                nums[i] = *riter;
                cout<<endl;
        for(auto iter: nums) cout<<iter<<" ";
        }
        
    }
};