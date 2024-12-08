class Solution {
    public String addSpaces(String s, int[] spaces) {
       if(s.isEmpty() || spaces.length==0) return new String("");
       StringBuilder str=new StringBuilder(s);
       for(int i=0,count=0; i<spaces.length && i<s.length(); i++) 
       {
        str.insert(spaces[i]+count," ");
        count+=1;
       } 
    return str.toString();
    }
}