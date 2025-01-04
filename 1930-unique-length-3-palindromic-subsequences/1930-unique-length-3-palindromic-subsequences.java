class Solution {
    public int countPalindromicSubsequence(String s) {
/*   
        approach 1 wrong
        if(s==null || s.length()==0 || s.trim().length()==0) return 0;
        Set<Character> charSet=new LinkedHashSet<>();
        Set<Character> set=new LinkedHashSet<>();
        Set<String> uniqueSubsequences=new LinkedHashSet<>();
        int count=0;
        for(char c: s.toCharArray()) charSet.add(c); // storing unique elements of stringh in set
         int i=0;
         for(char c: charSet)
       {
        for(int j=s.length()-1;i<s.length() && j>=0; i++, j--)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                for(int k=i+1; k<j; k++) set.add(s.charAt(k));
                count+=set.size();
            }
        }
       }
       return count;
       */

       // approach 2 
       if(s==null || s.length()==0 || s.trim().length()==0) return 0;
       int [] fo=new int[26];
       int [] lo=new int [26];
       Arrays.fill(fo, Integer.MAX_VALUE);
       for(int i=0; i<s.length(); i++)
       {
        fo[s.charAt(i)-'a']=Math.min(fo[s.charAt(i)-'a'], i);
        lo[s.charAt(i)-'a']=i;
        }
        int ans=0;
        for(int i=0; i<26; i++)
        {
            int f=fo[i];
            int l=lo[i];
            Set<Character> uniqueChars=new HashSet<>();
            if(f<l)
            {
                for(int j=f+1; j<l; j++) uniqueChars.add(s.charAt(j)); 
            }
            ans+=uniqueChars.size();
        }
        return ans;
    }
}