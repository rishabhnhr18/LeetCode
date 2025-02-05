class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       if(s1.equals(s2)) return true;
       for(int i=0; i<s1.length(); i++)
       {
        if(!s2.contains(s1.substring(i,i+1))) return false;
       }
       List<Character> l=new ArrayList<>();
       int count =0;
       for(int i=0; i<s1.length(); i++)
       {
        if(s1.charAt(i)!=s2.charAt(i))
        {
            l.add(s1.charAt(i));
            l.add(s2.charAt(i));
            count++;
        }
       }
       if(count>2) return false;
       for(int i=0, j=l.size()-1; i<l.size() && j>=0; i++, j--)
       {
        if(l.get(i)!=l.get(j)) return false;
       }
       return true;
    }
}