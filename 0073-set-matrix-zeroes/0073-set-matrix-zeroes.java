class Solution {
    public void setZeroes(int[][] matrix)
    {
        //now we need to optimize the code to get time complexity of O(mn)
        //previously we had time complexity of O(mn(m+n))
        //so to optimise that we need to store this two diff arrays rows and cloumns
        int m=matrix.length;
        int n=matrix[0].length;
        boolean [] rows=new boolean[m];
        boolean[] columns= new boolean[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=true;
                    columns[j]=true;
                }

            }

        }
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rows[i]==true||columns[j]==true)
                {
                    matrix[i][j]=0;
                }
            }
        }

        
    }
}