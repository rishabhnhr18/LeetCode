class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0 || s.length==0) return 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int left=0, right=0;
        int childSatisfied=0;
        while(left<s.length && right<g.length)
        {
            if(s[left]>=g[right])
            {
                right++;
                childSatisfied++;
            }
            left++;
        }
        return childSatisfied;

    }
}