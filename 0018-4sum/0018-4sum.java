class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        //now first you need to check if the size of the array is less than three
        List<List<Integer>>ans=new ArrayList<>();
        if(nums==null || nums.length<4)
        {
            return ans;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            //outer loop we are just taking and fixing a number
            if(i>0 && nums[i-1]==nums[i])
            continue;
            for(int j=i+1;j<nums.length-2;j++)//j=i+1 because we need to fix another number which we didnt yet see
            {
                if(j>i+1 && nums[j-1]==nums[j]) continue;
                //till now we fixed two numbers so now we need another two by two pointer approach
                int left=j+1;
                int right=nums.length-1;
                while(left<right)
                {
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        List<Integer>a=new ArrayList<>();
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        //ans.add(a);
                        left++;
                        right--;
                        while(left<right && nums[left-1]==nums[left])
                        {
                            left++;
                        }
                        while(left<right && nums[right+1]==nums[right])
                        {
                            right--;
                        }
                    }
                    else if(sum>target)
                    {
                        right--;
                    }
                    else
                    {left++;}
                }
            }
        {

        }
        }



        return ans;
    }
}