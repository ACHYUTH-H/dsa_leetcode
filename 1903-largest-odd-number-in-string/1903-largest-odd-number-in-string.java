class Solution {
    public String largestOddNumber(String num) 
    {
        int max=0;
        String s="";
        for(int i=num.length()-1;i>=0;i--)
        {
            if((int)num.charAt(i)%2==0)
            {
                continue;
            }
            else
            {
                return num.substring(0,i+1);

            }

        }
        return s;
    }
}