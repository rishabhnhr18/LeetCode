class Solution {
public:
    bool isPalindrome(int x) {
        long reverse=0;
        for(int num=x; num!=0; num=num/10)
        {
            int digit= num%10;
            reverse=(reverse*10)+digit;
        }
        cout<<reverse<<endl;
        if(reverse==x && reverse>=0) return true;
        else return false;
    }
};