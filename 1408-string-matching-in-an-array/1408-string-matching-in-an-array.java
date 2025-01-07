class Solution {
    public List<String> stringMatching(String[] words) {
        if(words==null || words.length==0) return new ArrayList<String>();
        Set<String> res=new HashSet<>();
        for(int i=0; i<words.length; i++)
        {   for(int j=i+1; j<=words.length-1; j++)
            {
                if(words[i].contains(words[j])) res.add(words[j]);
            }
        }
        for(int i=words.length-1; i>=0; i--)
        {
               for(int j=i-1; j>=0; j--)
            {
                if(words[i].contains(words[j])) res.add(words[j]);
            }
        }
        return new ArrayList<String>(res);

    }
}