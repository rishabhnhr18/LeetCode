class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        StringBuilder result= new StringBuilder();
        Arrays.sort(strs);
        if(strs[0]=="" || strs[0]==" ") return "";
        char[] first= strs[0].toCharArray();
        char[] second= strs[strs.length-1].toCharArray();
        for(int i=0; i<first.length; i++)
        {
            if(first[i]!= second[i]) break;
            else result.append(first[i]);
        }        
        return result.toString();
    }
}