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