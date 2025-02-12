/*
    What we Want
    i!=j and digits sum of nums[i] == digits sum of nums[j]
*/

class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
/*
        Approach 1 tle error
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                int res1 = 0, res2 = 0;
                for (; num1 > 0; num1 = num1 / 10)
                    res1 += num1 % 10;
                for (; num2 > 0; num2 = num2 / 10)
                    res2 += num2 % 10;
                if (res1 == res2)
                    max = Math.max(max, nums[i] + nums[j]);
            }
        }
        return max;
        */
        
        
        /*
            Approach 2  Using HashMap -> tore the sum of digits of each number if got same calcuate furthur, else add to map :)

        */

        Map<Integer, Integer> map= new HashMap<>();
        for(int num: nums)
        {
        int n = findDigitSum(num);
        if(map.containsKey(n))
        {
            max= Math.max(max, map.get(n)+num);
            int x= Math.max(num , map.get(n));
            map.remove(n);
            map.put(n, x);
        }
        else map.put(n, num);
        }
        return max;
    }
    private int findDigitSum(int num)
    {
        if(num<=0) return 0;
        int res=0;
        while (num> 0)
        {
            res+=num%10;
            num/=10;
        }
        return res;
    }
}