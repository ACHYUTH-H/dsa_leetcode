class Solution {
    public int myAtoi(String s) 
    {
     s=s.trim();
     if(s.length()==0)
     return 0;
     int ans=0;
     int sign=1;
     int i=0;
     if(s.charAt(0)=='-')
        {
            sign=-1;
            i=1;
        }
     else if(s.charAt(0)=='+')
     {
        i=1;
     }
     while(i<s.length() && s.charAt(i)=='0')
     {
        i++;
     }
     for(;i<s.length();i++)
     {
        
        if(Character.isDigit(s.charAt(i)))
        {
            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10 ||
                (ans == Integer.MAX_VALUE / 10 && digit > 7))
            {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=ans*10+(s.charAt(i)-'0');
        }
        else
        {break;}
     }
     return ans*sign;   
    }
}