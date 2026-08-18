class Solution {
    public int singleNumber(int[] nums) 
    {
    // int n= nums.length;
     int a=0;
     for(int i=0;i<nums.length;i++)
     {
        a=nums[i]^a;
     }
     return a;
    }
}