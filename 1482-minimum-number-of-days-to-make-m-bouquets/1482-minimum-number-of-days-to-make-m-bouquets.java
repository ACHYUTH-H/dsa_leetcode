class Solution {
    public boolean isPossible(int[]arr,int day,int m,int k)
    {
        int count= 0;
        int bouquets=0;
        for(int i:arr)
        {
            if(i<=day)
            {
                count++;//consecutive numbers increment
                if(count==k)
                {
                    count=0;
                    bouquets++;
                }
            }
            else  //no consecutive numbers 
            {
                count=0;
            }
        }
        return bouquets>=m;

    }
    public int maxi(int[] arr)
    {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public int mini(int[] arr)
    {
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public int minDays(int[] bloomDay, int m, int k) 
    {
        //m is number of boquteee
        //k is number of adjacent flowers
        //elements in bloomDay tells us how many days to wait for them
        int totalflowers=m*k;
        int bld=bloomDay.length;
        if(totalflowers>bloomDay.length)
        {
            return -1;
        }
        //okay this is binary search problem where 
        int max=maxi(bloomDay);
        int min=mini(bloomDay);
        int low=min;
        int high=max;
        int ans=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(bloomDay,mid,m,k))
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