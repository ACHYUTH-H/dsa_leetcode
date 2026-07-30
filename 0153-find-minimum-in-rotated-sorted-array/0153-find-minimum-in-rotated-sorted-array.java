class Solution {
    public int findMin(int[] nums) {
         //now lets think how it works
    int n=nums.length;
    if(n==1)
    {
        return nums[0];
    }
    int low=0;
    int high=n-1;
    int min=100000000;
    while(low<=high)
    {
        int mid=(low+high)/2;
        //first step check if left part of the array is sorted with mid
        if(nums[low]<=nums[mid])
        {
            //min will be the starting element
            min=Math.min(min,nums[low]);
            if(min>nums[high])
            {
                //right part of array is having the minimum
                //move left to right
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        //right part is sorted check if we can get the least element
        else
        {
            if(nums[mid+1]<=nums[mid])
            {
                min=Math.min(min,nums[mid+1]);
                low=mid+1;            }
            else
            {
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }

        }
    } 
       
       return min;  }
}