class Solution {
    private  int func(String s, int split, int maxi)
    {
        if(split>=s.length()) return maxi;
        char c1='0';
        char c2='1';
        int count1=(int)s.substring(0, split).chars().filter(c-> c==c1).count();
        int count2=(int)s.substring(split, s.length()).chars().filter(c-> c==c2).count();
        maxi= Math.max(count1+count2, maxi);
        return func(s, split+1, maxi);
    }
    public int maxScore(String s) {
        if(s==null) return 0;
        int maxi=0;
        return func(s, 1,maxi);
    }
}