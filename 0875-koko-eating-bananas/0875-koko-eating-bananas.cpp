class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low=1;
        int high=*std::max_element(piles.begin(), piles.end());
        while(low<=high)
        {
            int mid=(low+high)/2;
            long ans=0;
            for(int i=0; i<piles.size(); i++) ans+=(long)ceil(double(piles[i])/double(mid));
            if(ans<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
};