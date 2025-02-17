class Solution {
    public int[] constructDistancedSequence(int n) {
        int [] ans  = new int [(2*n)-1];
        boolean [] bool = new boolean [(2*n)-1];
        if(n ==1) ans[0]=1;
        else findLargestNumber(ans, bool, 0, n);
        return ans;
    }

    private boolean findLargestNumber(int[] ans, boolean  [] bool, int index, int n)
    {
        if(index == 2*n -1) return true;
        if(ans[index]!= 0 )  return findLargestNumber(ans, bool, index+1, n); //i.e place is already filed
        for(int i=n; i>=1; --i){
            if(bool[i]==true) continue;
                bool[i]=true;
                ans[index]=i;
                if(i == 1 && findLargestNumber(ans, bool, index+1, n)) return true;
                if(i>1 &&  (index+i)< (2*n-1) && ans[index+i]==0)
                {
                    ans[index+i] = i;
                    if(findLargestNumber(ans, bool , index+1, n)) return true;
                    ans[index+ i]=0;
                }
                bool[i]=false;
             ans[index]=0;
        }
        return false;
    }
}