class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(blocks ==null || blocks.length() == 0) return 0;
        if (blocks.length() < k) return 0;
        /* Apporach 1 Wrong
        int count =0;
        if(blocks.length() == k) {
        for(char element: blocks.toCharArray())
         {
            if (element == 'W') count++; 
         }
         return count;
        }
        int maxCount = 0;
        count = 0;

        for (int i=0; i< blocks.length(); i++){
            if (blocks.charAt(i) == 'B') count++;
            else
            {
                maxCount = Math.max(maxCount, count);
                count=0;
            }
        }   
            return k - maxCount;
            */
        int whiteCount = 0;
        int minCount = Integer.MAX_VALUE;
        for(int i=0; i<k ;i++){
            if(blocks.charAt(i) == 'W') whiteCount ++;
        }
        minCount= whiteCount;
        for (int i =k ;i<blocks.length(); i++)
        {
            if(blocks.charAt(i) == 'W') whiteCount++;
            if(blocks.charAt(i-k) == 'W') whiteCount --;
            minCount = Math.min(minCount, whiteCount);
        }
        return minCount;
    }
}