class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        for(long i=0; i<arr.size(); i++)
        {
            if(arr[i]<=k) k++;
            else break;

        }
        return k;
        }
};