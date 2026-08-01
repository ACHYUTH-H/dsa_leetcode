class Solution {
    public int findPeakElement(int[] nums) 
    {int n=nums.length;
    int low=0;
    int high=n-1;
    int peak=-1;
    while(low<=high)
    {
        if(low==high)
        {
            return low;
        }
        int mid=(low+high)/2;
        if(mid+1<nums.length)
        {
            if(nums[mid+1]>nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
    }
     return -2;   
    }
}