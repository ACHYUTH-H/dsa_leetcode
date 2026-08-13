class Solution {
    private void recursive(int[]nums,int ind,List<List<Integer>>res,List<Integer>curr)
    {
        res.add(new ArrayList<>(curr));
     for(int i=ind;i<nums.length;i++)  
        {
            if(i>ind && nums[i]==nums[i-1])
            {
                continue;
            }
       //add element
       curr.add(nums[i]);
       //recurse call
       recursive(nums,i+1,res,curr);
       //backtracking
       curr.remove(curr.size()-1);
       }  
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
     List<List<Integer>>res=new ArrayList<>();
     Arrays.sort(nums);
     //i think we can use 
     //int[] subset=Arrays.copyOfRange(arr,1,3);
     recursive(nums,0,res,new ArrayList<>());
    return res;
    }
}