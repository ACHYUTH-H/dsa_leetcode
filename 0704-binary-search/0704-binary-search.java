class Solution {
    public int binary(int []nums,int target,int left,int right)
    {
        int middle=(left+right)/2;
        if(left>right)
        {
            return -1;
        }
        if(nums[middle]>target)
        {
            return binary(nums,target,left,middle-1);

        }
        else if(nums[middle]<target)
        {
           return  binary(nums,target,middle+1,right);
        }
        
            return middle;
        
        
    }
    public int search(int[] nums, int target) 
    {
    // so here we are gonna use binary search 
    int n=nums.length;
    //the array is already sorted so we never need to think of doing that
    int left=0;
    int right=n-1;
    int a=binary(nums,target,left,right);
    return a;
    
        
    }
}