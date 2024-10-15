class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int high=std::accumulate(weights.begin(),weights.end(), 0);
        int low=*std::max_element(weights.begin(),weights.end());
        while(low<=high)
        {
            int daysRequired=1, load=0;
            int mid=(low+high)/2;
            for(int i=0; i<weights.size(); i++)
            {
                if(load+weights[i]>mid)
                {
                    daysRequired=daysRequired+1;
                    load=weights[i];
                }
                else load+=weights[i];
            }
            if(daysRequired<=days) high=mid-1;
            else low=mid+1;
        }
        return low;  //opposite polarity
    }
};