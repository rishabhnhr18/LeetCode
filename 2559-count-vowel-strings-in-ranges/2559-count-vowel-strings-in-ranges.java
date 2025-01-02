class Solution {
     private boolean isVowel(char c)
        {
            return (c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u');
        }
    public int[] vowelStrings(String[] words, int[][] queries) {
    
        if(queries==null || queries[0].length==0 || words==null || words.length==0) return new int[0];
        int [] prefix_sum=new int [words.length+1];
        for(int i=0; i<words.length; i++)
        {
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt((words[i].length())-1))) prefix_sum[i+1]=1+prefix_sum[i];
            else prefix_sum[i+1]=prefix_sum[i];
        }
        int answer[] =new int[queries.length];
        for(int i=0; i<queries.length ; i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            answer[i]=prefix_sum[right+1]-prefix_sum[left];
        }
        return answer;
    }
}