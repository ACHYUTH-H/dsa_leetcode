class Solution {
    public boolean isp(int[]nums,int mid,int days)
    {
       int daysused=1;
       int currweight=0;
       //now mid is weight 
       for(int i:nums)
       {
         currweight+=i;
        if(currweight>mid)
        {
            daysused++;
            currweight=i;
        }
        
       }
       return daysused<=days;
    }

    public int shipWithinDays(int[] weights, int days) 
    {
       
        int sum=0;
        int max=0;
        for(int i:weights)
        {
            max=Math.max(max,i);
            sum=sum +i;
        } 
        //now we have sum
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if (isp(weights,mid,days))
            {
                 ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;     
            }
        }
       
return ans;
    }
}