class Solution {
    public int countPrimes(int n) 
    {
        //now we know till which vlue we need to check
        if(n<=2)return 0;
        boolean[]nums=new boolean[n];
        int count=0;
       
        for(int i=2;i*i<n;i++)
        {
            if(!nums[i])
            {
                 //count++;
                 int j=i*i;
               while(j<n)
               {
                nums[j]=true;
                j=j+i;
               }
               
                //if it is prime then mark all of the numbers which is multiple to zero
            }
        }
        //now we will have 1 in arr which tells us prime number
        for(int i=2;i<n;i++)
        {
            if(!nums[i])
            count++;
        }
        return count;
        
    }
}