class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
       vector<int>nums3(nums1.size()+nums2.size());
       int i=0;
       for(int iter: nums1)
       {
        nums3[i]=iter;
        i++;
       } 
       for(int iter: nums2)
       {
        nums3[i]=iter;
        i++;
       }
       sort(nums3.begin(), nums3.end()); 
       if(nums3.size()%2!=0) return (double)nums3[(double)nums3.size()/2];
       else
       {
        int x=(double)nums3.size()/2;
        return (double)(nums3[x]+nums3[x-1])/2;
       }
    }
};