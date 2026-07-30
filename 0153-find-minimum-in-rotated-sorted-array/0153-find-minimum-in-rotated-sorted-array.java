class Solution {
    public int findMin(int[] nums) 
    {
        int low=0;
        int high=nums.length-1;
        int min=100000;
        
        while(low<=high)
        {
            if(nums[low]<=nums[high])
            {
                //entire array is sorted
                return Math.min(min,nums[low]);
            }
            int mid=(low+high)/2;
            //now we are checking if left part is sorted
            if(nums[low]<=nums[mid])
            {
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            //now right part is sorted
            else
            {
                min=Math.min(min,nums[mid]);
                high=mid-1;

            }
        }
        return min;
        
    }
}