class Solution {
    public int sumSubarrayMins(int[] arr) 
    {
        //we now know how to solve this using two or nested array problem which gives us the time complexity of O(n^2)
        //we need O(n) so use monotonic stack
        int n=arr.length;
        int[] nextsm=new int[n];
        int[] prevsm=new int[n];
        Stack<Integer>next=new Stack<>();
        Stack<Integer>prev=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!prev.isEmpty()&& arr[prev.peek()]>arr[i])
            {
                prev.pop();
            }
            prevsm[i]=prev.isEmpty()?-1:prev.peek();
            prev.push(i);
        }

        for(int i=n-1;i>=0;i--)
        {
            while(!next.isEmpty()&& arr[next.peek()]>=arr[i])
            {
                next.pop();
            }
            nextsm[i]=next.isEmpty()?n:next.peek();
            next.push(i);
        }
        long sum=0;
        long mod=1000000007;
        for(int i=0;i<n;i++)
        {
            long left= i-prevsm[i];
            long right=nextsm[i]-i;
            long res=(left*right)%mod;
            sum=(sum+res*arr[i])%mod;
        }
        return (int)sum;
    }
}