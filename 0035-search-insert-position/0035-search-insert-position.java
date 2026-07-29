class Solution {
    public int binary(int[]nums,int target,int left,int right)
    {
        if(left>right)
        {
            return left;
        }
        int middle= (left+right)/2;
        if(nums[middle]<target)
        {
            return binary(nums,target,middle+1,right);
        }
        else if(nums[middle]>target)
        {
            return binary(nums,target,left,middle-1);
        }
       
       if(right==left)
       {return right;}
            return middle;
       
    }
    public int searchInsert(int[] nums, int target) {
        int a=binary(nums,target,0,nums.length-1);
        return a;
    }
}