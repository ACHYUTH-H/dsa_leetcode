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
            
            //checking if the stack is empty and if top element is greater

            while(!st.isEmpty() && a<prefix[st.peek()])
            {
                //is new number is less than stack top element
                //pop that element and calculate the max sum
                int height=prefix[st.pop()];
                //here prefix of st is giving the value which has been calculated
                int width=st.isEmpty()?i:i-st.peek()-1;
                sum=Math.max(sum,height*width);
            }
            //push the current to the stack 
            st.push(i);
        }
        return sum;
    }
    public int maximalRectangle(char[][] matrix) 
    {
        //first we need to calculate the prefix sum 
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
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