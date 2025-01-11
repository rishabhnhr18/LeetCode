class Solution {
    public boolean canConstruct(String s, int k) {
        if(s==null || k==0 || s.length()==0 || s.length()<k) return false;
        if(s.length()==k) return true;
        Map<Character, Integer> map=new HashMap<>();
        for(char c: s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int count=0;
        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
         if(entry.getValue()%2!=0) count++;   
        }
        return count<=k;
    }
}