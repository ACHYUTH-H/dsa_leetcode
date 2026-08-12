class Solution {
    private void merge(int[] arr, int low, int mid, int high)
{
    int i = low;       // left half
    int j = mid + 1;   // right half

    int k = 0;

    int[] temp = new int[high - low + 1];

    // Compare both halves
    while(i <= mid && j <= high)
    {
        if(arr[i] <= arr[j])
        {
            temp[k] = arr[i];
            i++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
        }

        k++;
    }

    // Remaining elements from left half
    while(i <= mid)
    {
        temp[k] = arr[i];
        i++;
        k++;
    }

    // Remaining elements from right half
    while(j <= high)
    {
        temp[k] = arr[j];
        j++;
        k++;
    }

    // Copy temp back into original array
    for(int x = 0; x < temp.length; x++)
    {
        arr[low + x] = temp[x];
    }
}
    public void sort(int[]candidates,int low,int high)
    {
        //okay lets insert merge sorting
        if(low>=high)
        {
            return ;
        }
       
        int mid = low + (high - low) / 2;
        sort(candidates,low,mid);
        sort(candidates,mid+1,high);
        merge(candidates,low,mid,high);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> res=new ArrayList<>();
       sort(candidates,0,candidates.length-1);

        solve(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    private void solve(int[]candidates,int target,int index,List<Integer> curr, List<List<Integer>>res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0||index>=candidates.length)
        {
            return;
        }
        // //take element 
        // curr.add(candidates[index]);
        // solve(candidates,target-candidates[index],index+1,curr,res);
        // //backtracking
        // curr.remove(curr.size()-1);
        // //skip element
        // solve(candidates,target,index+1,curr,res);
        for(int i = index; i < candidates.length; i++)
{
    if(i > index && candidates[i] == candidates[i - 1])
    {
        continue;
    }

    curr.add(candidates[i]);

    solve(candidates, target - candidates[i], i + 1, curr, res);

    curr.remove(curr.size() - 1);
}
//solve(candidates,target,index+1,curr,res);

    }
}