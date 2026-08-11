class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
     //the general solution i am thinking of is putting those numbers in hashmap and take difference untill we get the desired element and then update this to the result 
     List<List<Integer>>res=new ArrayList<>();   
     //hashmap apprach is not correct because we need to add so many times a same number
    
    solve(candidates,0,target,new ArrayList<>(),res);
    return res;
    }
    public void solve(int[]candidates,int index,int target,List<Integer>curr,List<List<Integer>>res)
    {
        //candidates consists of what the elements are there in the given array
        //here we wil keep on reducing the target and increasing the curr value
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
         if (index >= candidates.length || target < 0) {
            return;
        }
            //take
            curr.add(candidates[index]);
        solve(candidates,index,target-candidates[index],curr,res);
        //backtrack
        curr.remove(curr.size()-1);
        //skip
        solve(candidates,index+1,target,curr,res);
        
        


    }

}