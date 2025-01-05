class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        if(shifts==null || s==null ||shifts.length==0 || s.length()==0 ||s.trim().length()==0) return "";
        
        /*
                Approach 1 correct but tle error for big inputs 
        StringBuilder str=new StringBuilder(s);
        for(int j=0; j<shifts.length; j++)
        {
            int start=shifts[j][0];
            int end=shifts[j][1];
            int direction=shifts[j][2];
            char c;
            if(direction==1)  //forward
            {
                for(int i=start; i<=end; i++)
                {
                    c=(char)((str.charAt(i)-'a'+1+26)%26+'a');
                    str.setCharAt(i,c);
                }
            }
            else                // backwards 
            {
                for(int i=start; i<=end; i++)
                {
                    c=(char)((str.charAt(i)-'a'-1+26)%26+'a');
                    str.setCharAt(i,c);
                }
            }
        } 
        return str.toString();
        */

        // approach 2 maintaining cummulative shifts
        int []shiftArray=new int[s.length()+1];
        StringBuilder str=new StringBuilder();
        for( int [] shift: shifts)
        {
            int start=shift[0];
            int end=shift[1];
            int direction=shift[2];
            if(direction==1)
            {
                shiftArray[start]+=1;
                if(end+1<s.length()) shiftArray[end+1]-=1;
            }
            else 
            {
                shiftArray[start]-=1;
                if(end+1<s.length()) shiftArray[end+1]+=1;
            }
        }
            int movePlace=0;
            for(int i=0; i<s.length(); i++)
            {
                movePlace+=shiftArray[i];
                movePlace=(movePlace%26+26)%26;
               char c=(char)((s.charAt(i)-'a'+movePlace+26)%26+'a');
                str.append(c);
            } 
        return str.toString();
    }
}