class Solution {
    public int subarraySum(int[] nums, int k) 
    {
    HashMap<Integer,Integer>maps=new HashMap<>();
    maps.put(0,1);
    int prefix=0;
    int count=0;
    for(int num:nums)
    {
        prefix+=num;
        if(maps.containsKey(prefix-k))
        {
             count+=maps.get(prefix-k);
        }
        maps.put(prefix,maps.getOrDefault(prefix,0)+1);   
    }   
    return count; 
    }
}