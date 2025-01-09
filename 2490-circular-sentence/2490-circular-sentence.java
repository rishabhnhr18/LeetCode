class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence==null || sentence.length()==0) return false;
        String []words=sentence.split(" ");
        if(words.length==1) return sentence.charAt(0)==sentence.charAt(sentence.length()-1);
        if(words[0].charAt(0)!=words[words.length-1].charAt(words[words.length-1].length()-1)) return false;
        for(int i=0; i<words.length-1; i++)
        {
            if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)) return false;
        }
        return true;
    }
}