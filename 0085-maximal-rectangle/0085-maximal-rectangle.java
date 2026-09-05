class Solution 
{
    //this is a histogram problem with one more dimention added

    public int hist(int[] prefix)
    {
        Stack<Integer>st=new Stack<>();
        int sum=0;

        for(int i=0;i<=prefix.length;i++)
        {
            int a = (i==prefix.length)? 0: prefix[i];
            
            while(!st.isEmpty() && a<prefix[st.peek()])
            {
                int height=prefix[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                sum=Math.max(sum,height*width);
            }
            st.push(i);
        }
        return sum;
    }
    public int maximalRectangle(char[][] matrix) 
    {
        //first we need to calculate the prefix sum 
        
        int n=matrix.length;//number of rows
        int m=matrix[0].length;//number of columns
        int prefixsum[][]=new int[n][m];
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                if(matrix[j][i]=='0')
                sum=0;
                else
                {
                sum+=1;
                }
                prefixsum[j][i]=sum;
            }
        }
        //i think we now have the prefixsum array which consists of all the prefixes 

        int ans= 0;
        for(int i=0;i<n;i++)
        {
        ans=Math.max(ans,hist(prefixsum[i]));
        }
        return ans;

    }
}