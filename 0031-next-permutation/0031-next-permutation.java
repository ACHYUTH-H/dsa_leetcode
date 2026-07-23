class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n=nums.length;
        int i=n-1;
        int pivot=-1;
        int j=i;
        while(i>0)
        {
            if(nums[i-1]<nums[i])
            {
                //we found a pivot
                pivot=i-1;
                j=n-1;
                while(nums[j]<=nums[pivot])
                {
                    j--;
                }
                int temp=nums[pivot];
                nums[pivot]=nums[j];
                nums[j]=temp;
                break;
            }
            
            i--;
        }
        //till now we have not made the changes in ascending order
        //pivot+1 to last we need to make it ascending

        int low=pivot+1;
        
        int high=n-1;
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
        
    }
}