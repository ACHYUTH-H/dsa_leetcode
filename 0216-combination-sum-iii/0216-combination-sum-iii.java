class Solution {
    public void solve(int []arr,int k,int n,int index,List<List<Integer>>res,List<Integer>curr)
    {
        //we need to iterate till k maybe so reduce k and as well as reduce n 
        if(n==0&&k==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(k<0||n<0)
        {
            return ;
        }
         for(int i = index; i < arr.length; i++)
{
    if(i > index && arr[i] == arr[i - 1])
    {
        continue;
    }

    curr.add(arr[i]);

    solve(arr, k-1,n-arr[i], i + 1, res, curr);

    curr.remove(curr.size() - 1);
}
    }
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        int [] arr={1,2,3,4,5,6,7,8,9};
        //array is already sorted we need to send this 
        List<List<Integer>>res=new ArrayList<>();

        solve(arr,k,n,0,res,new ArrayList<>());
    return res;
    }
}