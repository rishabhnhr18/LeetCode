class Solution {
    private char[] reverseString (String str)
    {
        if(str==null) return new char[0];
        int start=0;
        int end=str.length()-1;
        char temp=' ';
        char []ans =str.toCharArray();
        while(start<end)
        {
            temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
        return ans;
    }

    public String multiply(String num1, String num2) {
    if(num1==null | num2==null) return "";
        char s1[]=reverseString(num1);
        char s2[]=reverseString(num2);
        int []ans=new int[num1.length()+num2.length()];
        for(int i=0; i<s1.length; i++)
        {
            int carry=0;
            int index=i;
            for(int j=0; j<s2.length; j++)
            {
                int n1=s1[i]-'0';
                int n2=s2[j]-'0';
                int mul=((n1*n2)+carry+ans[index]);
                ans[index++]=mul%10;
                carry=mul/10;
            }
            if(carry!=0) ans[index]=carry;
        }
        int i=ans.length-1;
        for(; i>0 && ans[i]==0; i--);
        String returnString="";
        for(;i>=0; i--) returnString+=ans[i];
        return returnString;
    }
}