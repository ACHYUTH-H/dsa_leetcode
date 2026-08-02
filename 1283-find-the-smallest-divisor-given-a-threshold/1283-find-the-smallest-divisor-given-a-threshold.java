class Solution {
    public boolean isPossible(int[]nums,int mid,int k)
    {
        int sum=0;
        for(int i :nums)
        {
            sum= sum+ (i+mid-1)/mid;
            if(sum>k)
        {
            return false;
        }
        }
                return true;
    }
    public int mini(int[] nums)
    {
        int min=1000000;
        for(int i:nums)
        {
            min=Math.min(min,i);
        }
        return min;
    }
    public int maxi(int[]nums)
    {
        int max=0;
        for(int i:nums)
        {
            max=Math.max(max,i);
        }
        return max;
    }
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int n=nums.length;
        int min=mini(nums);
        int max=maxi(nums);
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(nums,mid,threshold))
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