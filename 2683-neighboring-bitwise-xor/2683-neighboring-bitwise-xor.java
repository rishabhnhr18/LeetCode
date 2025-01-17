class Solution {
    public boolean doesValidArrayExist(int[] derived) {
     int xor=0;
     for(int element: derived)
     {
        xor^=element;
     }   
     return xor==0;
    }
}