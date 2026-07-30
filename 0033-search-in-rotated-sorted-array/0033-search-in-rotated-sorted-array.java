class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
           
            //checking if the array is sorted to the left side
            if(nums[low]<=nums[mid])
            {
                //if yes then we will see if the target lies in between this 
                if(nums[low]<=target&&target<nums[mid])
                {
                    //we have the target in the left range and which is sorted               
                    high=mid-1;             
                }
                else 
                {
                    low=mid+1;
                }
            }
            else
            {
                //right part is sorted so we are checking towards right
                if(nums[mid]<target&&target<=nums[high])
                
                    //now the target lies in right
                   
                        low=mid+1;

                    else
                    {
                        high=mid-1;
                    }
                }
            }
            return -1;
        }
        
    }
