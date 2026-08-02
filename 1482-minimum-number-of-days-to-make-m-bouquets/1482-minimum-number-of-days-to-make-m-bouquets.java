class Solution {
    public boolean isPossible(int[]bloomDay,int days,int m, int k)
    {
        //understand what is m and what is k
        int count=0;//flowers consecutive
        int bloom=0;//bouquet
        //compare with like indexed thing
        for(int i:bloomDay)
        {
            if(i<=days)//comparing mid value with days mentioned in array
            {
                count++;
                if(count==k)//compare
                {
                    count =0;
                    bloom++;
                } 

            }
            else
            {
                count=0;
            }
        }
        return bloom>=m;
    }
    public int mini(int[]bloomDay)
    {
        int min=1000000000;
        for(int bloom:bloomDay)
        {
            min=Math.min(min,bloom);
        }
        return min;
    }
    public int maxi(int[]bloomDay)
    {
        int max=0;
        for(int bloom:bloomDay)
        {
            max=Math.max(max,bloom);
            
        }
        return max;
    }

    public int minDays(int[] bloomDay, int m, int k) 
    {
    int n=bloomDay.length;
    if((long)m*k>n)
    {
        return -1;
    }
        //find min and max
    int min=mini(bloomDay);
    int max=maxi(bloomDay);
    //now find low and high and iterate through loop
    int low=min;
    int high=max;
    int ans=-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if (isPossible(bloomDay,mid,m,k))
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