class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int bestsum=nums[0];
        if(n==1)
        {
            return nums[0];
        }
        for(int i=1;i<n;i++)
        {
            if(sum+nums[i]<nums[i])
            {
                sum=nums[i];
                if(sum>bestsum)
                {bestsum=sum;}
                
                
            }
            else if(sum+nums[i]>=nums[i])
            {
                sum=sum+nums[i];
                if(sum>bestsum)
                {bestsum=sum;}
            }
        }
        
        return bestsum;
    }
}