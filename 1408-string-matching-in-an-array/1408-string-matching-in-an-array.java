class Solution {
    public List<String> stringMatching(String[] words) {
        if(words==null || words.length==0) return new ArrayList<String>();
        Set<String> res=new HashSet<>();
        List<String> ans=new ArrayList<>();
        for(int i=0; i<words.length; i++)
        {   for(int j=i+1; j<=words.length-1 && i<j; j++)
            {
                if(words[i].contains(words[j])) res.add(words[j]);
            }
        }
        for(int i=words.length-1; i>=0; i--)
        {
               for(int j=i-1; j>=0 && j<i; j--)
            {
                if(words[i].contains(words[j])) res.add(words[j]);
            }
        }
        for(String s: res) ans.add(s);
        return ans;

    }
}