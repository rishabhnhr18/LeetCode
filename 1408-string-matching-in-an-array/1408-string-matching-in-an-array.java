class Solution {
    public List<String> stringMatching(String[] words) {
        if (words == null || words.length == 0)
            return new ArrayList<String>();
        /*
         * Approach 1 correct
         * Set<String> res=new HashSet<>();
         * for(int i=0; i<words.length; i++)
         * { for(int j=i+1; j<=words.length-1; j++)
         * {
         * if(words[i].contains(words[j])) res.add(words[j]);
         * }
         * }
         * for(int i=words.length-1; i>=0; i--)
         * {
         * for(int j=i-1; j>=0; j--)
         * {
         * if(words[i].contains(words[j])) res.add(words[j]);
         * }
         * }
         * return new ArrayList<String>(res);
         */

        // approach 2

        Set<String> res = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (i != j) {
                    if (words[i].contains(words[j]))
                        res.add(words[j]);
                   else if(words[j].contains(words[i]))
                        res.add(words[i]);
                }
            }
        }
        return new ArrayList<>(res);
    }
}