class Solution {
      public long subarrayrange(int [] nums)
      {
        return sumsubarrayMax(nums)-sumsubarrayMin(nums);
      }
    
    public long sumsubarrayMax(int[]nums)
    {
        int n=nums.length;
        int[] prev= new int[n];
        int[] next= new int [n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            int a= nums[i];
            while(!st.isEmpty() && nums[st.peek()]<a)
            {
                st.pop();
            }
          
            prev[i]=st.isEmpty()?-1:st.peek();
              st.push(i);
        }
        st.clear();
        //we are calculating nect so it should be from right to left
        for(int i = n-1;i>=0;i--)
        {
            int a = nums[i];
            while(!st.isEmpty() && nums[st.peek()]<=a)
            {st.pop();}
            
            next[i]=st.isEmpty()?n:st.peek();
            st.push(i);
       }
        long sum =0;
        for(int i =0 ;i<n;i++)
        {
            long left=i-prev[i];
            long right= next[i]- i;
            sum= sum+left*right*nums[i];
        }
        return sum;
    }



    public long sumsubarrayMin(int[]nums)
    {
        int n=nums.length;
        int[] prev= new int[n];
        int[] next= new int [n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            int a= nums[i];
            while(!st.isEmpty() && nums[st.peek()]>a)
            {
                st.pop();
            }
            
            prev[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        //we are calculating nect so it should be from right to left
        for(int i = n-1;i>=0;i--)
        {
            int a = nums[i];
            while(!st.isEmpty() && nums[st.peek()]>=a)
            {st.pop();}
            
            next[i]=st.isEmpty()?n:st.peek();
            st.push(i);
       }
        long sum =0;
        for(int i =0 ;i<n;i++)
        {
            long left=i-prev[i];
            long right= next[i]- i;
            sum= sum+left*right*nums[i];
        }
        return sum;
    }

    


    public long subArrayRanges(int[] nums) 
    {
      
        return subarrayrange(nums);
    }
}