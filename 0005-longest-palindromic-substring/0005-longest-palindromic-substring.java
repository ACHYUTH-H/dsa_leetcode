class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length()<=1)
        {
            return s;
        }
        int max=1;
        String maxStr=s.substring(0,1);
     for(int i=0;i<s.length();i++)
     {
        //this is for odd
        int l=i-1,r=i+1;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r) )
        {
            int m=r-l+1;
            if(m>max)
            {
                max=m;
                maxStr=s.substring(l,r+1);
            }
            l--;
            r++;
        }
        //this is for even
        l=i;
        r=i+1;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r) )
        {
            int m=r-l+1;
            if(m>max)
            {
                max=m;
                maxStr=s.substring(l,r+1);
            }
            l--;
            r++;
        }

     }   
     return maxStr;
    }
}