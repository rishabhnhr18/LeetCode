class Solution {
    public String frequencySort(String s) {
        if(s==null || s.length()==0) return "";
        Map<Character, Integer> m=new HashMap<>();
        StringBuilder str=new StringBuilder();
        for(char c: s.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);     
        
        List<Character> lst=new ArrayList<>(m.keySet());
        lst.sort((a,b)->m.get(b)-m.get(a));
        for(char c: lst)
        {
            int count=m.get(c);
            int i=1;
            while(i<=count)
            {
                str.append(c);
                i++;
            }
        }
        return str.toString();
    }

}