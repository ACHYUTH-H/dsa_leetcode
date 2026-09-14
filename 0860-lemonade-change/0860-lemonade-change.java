class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int five=0;
        int ten=0;
        int i =0;

        while(i<bills.length)
        {
            if(bills[i]==5)
            {
                five++;
            }
            if(bills[i]==10)
            {
                ten++;
                if(five==0)
                {
                    return false;
                }
                else
                {
                    five--;
                }
            }
            if(bills[i]==20)
            {
                if(ten==0 && five<3)
                {
                    return false;
                }
                else if(ten==0 && five>=3)
                {
                    five=five-3;

                }
                else if (ten>0 && five>0)
                {
                    ten--;
                    five--;
                }
                else
                {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}