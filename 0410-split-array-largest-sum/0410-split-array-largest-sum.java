class Solution {
    public int count(int[]nums,int maxSum)
    {
        int currentSum=0,cou=1;
        for(int num:nums)
        {
            if(currentSum+num<=maxSum)
            {
                
                currentSum+=num;
            }
            else
            {cou++;currentSum=num;}
        }
        return cou;
    }
    public int splitArray(int[] nums, int k) 
    {
        int sum=0;
        int max=0;
        for(int i:nums)

        {       max=Math.max(max,i);
                sum=sum+i;
        }       
        int low=max;
        int high=sum;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int how=count(nums,mid);
            if(how>k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        
    return low;
}
}