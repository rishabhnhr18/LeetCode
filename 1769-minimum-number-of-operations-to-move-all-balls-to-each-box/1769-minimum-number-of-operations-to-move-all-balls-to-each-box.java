class Solution {
    public int[] minOperations(String boxes) {
     if(boxes==null || boxes.length()==0) return new int[0];
     int left[] =new int[boxes.length()];
     int right[] =new int[boxes.length()];  
     int ball = Integer.parseInt(boxes.substring(0,1));
     for(int i=1; i<boxes.length(); i++)
     {
        left[i]=ball+left[i-1];
        if(boxes.charAt(i)=='1') ball+=1; 
     }
     ball =boxes.charAt(boxes.length()-1)-'0';
     for(int i=boxes.length()-2; i>=0; i--)
     {
        right[i]=ball+right[i+1];
        if(boxes.charAt(i)=='1') ball+=1;
     }
        for(int i=0 ; i<right.length; i++) left[i]+=right[i];
        return left;
    }
}