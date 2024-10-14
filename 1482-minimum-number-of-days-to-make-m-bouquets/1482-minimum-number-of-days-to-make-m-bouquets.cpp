class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {

        if ((long long)bloomDay.size() < ((long long)m *(long long) k))
            return -1;
        int  bouquets = 0, count = 0;
        int low = *std::min_element(bloomDay.begin(), bloomDay.end());
        int high = *std::max_element(bloomDay.begin(), bloomDay.end());
        while (low <= high) {
            bouquets = 0;
            count = 0;
            int  mid = (low + high) / 2;
            for (int i = 0; i < bloomDay.size(); i++) {
                if ((bloomDay[i]) <= mid)
                    count++;
                else {
                    bouquets += (count / k);
                    count = 0;
                }
            }

            bouquets += (count / k);
            if (bouquets < m)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
};