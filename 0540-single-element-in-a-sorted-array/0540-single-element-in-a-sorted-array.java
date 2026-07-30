class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(low==high)
            {
                return nums[low];
            }
            if((mid%2)==0)//if mid is even
            {
                //need to check if nums[mid+1 ] is same
                if((mid+1)<nums.length && nums[mid+1]==nums[mid])
                {
                    //so till now element has not been seen
                    low=mid+2;
                }
                //mid is even but next number is not same 
                //two cases this is the element or element has already been seen left side
                else
                {
                    
                        high=mid;
                    
                }
            }
            //if mid is odd we need to get the same value prev element
            else
            {
               mid--;
                //need to check if nums[mid+1 ] is same
                if((mid+1)<nums.length && nums[mid+1]==nums[mid])
                {
                    //so till now element has not been seen
                    low=mid+2;
                }
                //mid is even but next number is not same 
                //two cases this is the element or element has already been seen left side
                else
                {
                   
                    
                        high=mid;
                    
                }

            }
        }
        return -1;
    }
}