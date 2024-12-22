class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;// Initialize the notes the seller has in the beginning
        if (bills.length == 0)
            return false; // egde case
        for (int bill : bills) {
            if (bill == 5)
                five++;
            else if (bill == 10) {
                if (five >= 1) {
                    five--;
                    ten++;
                } else
                    return false;
            } else if (bill == 20) {
                
                if (five >= 1 && ten >= 1) {
                    twenty++;
                    ten--;
                    five--;
                }
                else if(five >= 3)
                {
                    five=five-3;
                }
                 else
                    return false;
                    twenty++;
            }
        }
        return true;
    }
}