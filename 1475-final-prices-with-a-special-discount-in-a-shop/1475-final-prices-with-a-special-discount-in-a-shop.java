class Solution {
    public int[] finalPrices(int[] prices) {
/*
        Approach 1 (Wrong)
        If you buy the ith item,
        then you will receive a discount equivalent to prices[j]
         where j is the minimum index such that j > i 
         and prices[j] <= prices[i].
          Otherwise, you will not receive any discount at all.
        if(prices.length==0) return new int[0];
        int res[]=new int[prices.length];
        int i=0;
        for(int j=1; j<prices.length; i++, j++)
        {
            if(prices[j]<=prices[i] && j>i) res[i]=prices[i]-prices[j];
            else res[i]=prices[i];
        }
        res[i]=prices[i];
        return res;
       */

       //Approach 2
       if(prices.length==0) return new int[0];
       int res[]=new int[prices.length];
       for(int i=0; i<prices.length; i++)
       {
        res[i]=prices[i]; // default prices of the item without discount
        for(int j=i+1; j>i && j<prices.length; j++) //chekcing for smaller value then previous value
        {
            if(prices[j]<=prices[i])
            {
                res[i]-=prices[j];
                break;  //got discount, end loop, end this and search for the next item
            }
        }
       }
       return res; 
    }
}