class Solution {
    public boolean search(int[] nums, int target) 
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        boolean ans=false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid] == target)
{
    return true;
}
if(nums[low] == nums[mid] && nums[mid] == nums[high])
{
    low++;
    high--;
    continue;
}
           //check if left part is sorted or not
           if(nums[low]<=nums[mid])
            {
                //if yes check if target lies in this region
                if(nums[low]<=target && target<nums[mid])
                {
                    high=mid-1;
                   
                }
                else
                {
                    
                    low=mid+1;
                }
            }
            //else if right part is sorted or not
            else
            {
                if(nums[mid]<target && target<=nums[high])
                {
                    low=mid+1;
                  
                }
                else
                {
                    high=mid-1;
                }
                
            }

        }
        return ans;
    }
}