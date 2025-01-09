class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index;
        String [] words = sentence.split(" ");
        for(int i=0; i<words.length; i++)
        {
            if(words[i].startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}