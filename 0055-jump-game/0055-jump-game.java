class Solution {
    public boolean canJump(int[] nums) 
    {
    int n =nums.length;
    for(int i= n-1;i>0;i--)
    {
     //   int curr=nums[i];
        for(int j=i-1;j>=0;j--)
        {
            if(j==0 && nums[j]<i-j)
            {
                return false;
            }
            if(nums[j]==0)
            {
                continue;
            }
            // if(nums[j]<i-j)
            // {
            //     return false;
            // }
            
            if(nums[j]>=i-j)
            {
                break;
            }
        }

    }   
    return true; 
    }
}