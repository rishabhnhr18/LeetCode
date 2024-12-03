class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder reverseString = new StringBuilder();
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]);
            if(i>0) reverseString.append(" ");
        }
        return reverseString.toString();
    }
}