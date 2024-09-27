#include<bits/stdc++.h>
class Solution {
public:
    int reverse(int x) {
            long reverse=0;
            for(int num=x; num!=0; num=num/10)
            {
                int digit=num%10;
                reverse=(reverse*10)+digit;
            }
          if(reverse<INT_MIN || reverse> INT_MAX ) return 0;
            return reverse;
    }
};