class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
//number of elements in the powerset is equal to 2 power n
    int n=nums.length;
    List<List<Integer>>ans=new ArrayList<>();
    int pn=1<<n;//its 2power n
    for(int num=0;num<pn;num++)//from 0 to pn
    {
        List<Integer>temp=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if((num&(1<<i))!=0)
             temp.add(nums[i]);
        }
        ans.add(temp);  
    }
    return ans;
    }
}