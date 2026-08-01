class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n=piles.length;
        // need to know what is the maximum 
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];

            }
            sum=sum+piles[i];
        }
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int hours=0;
            for(int i=0;i<n;i++)
            {
                hours += Math.ceil((double)piles[i] / mid);
            }
            if(hours<=h)
            //here we might get confused because we need to move right with updating low but the reason we stayed and moved right is we need to increase speed means decrease time so the conditions become exchanged
            {
                max=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
 return max;     
    }
}