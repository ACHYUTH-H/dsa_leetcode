class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        // first i tired to make the changes as we proceed the array but we will loose track of number of zeroes 
        // now we need to make sure that we have proper number of zeroes and the positions so we need to store and access
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=0;
                }
            }
        }
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    for (int a=0;a<m;a++)
                    {
                        matrix[a][j]=0;
                    }
                    for(int b=0;b<n;b++)
                    {
                        matrix[i][b]=0;
                    }
                }
            }
        }
        
    }
}