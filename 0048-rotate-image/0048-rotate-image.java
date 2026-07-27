class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }

            }
        }
        //till now we have done transpose of the array 
        
        for(int i=0;i<n;i++)
        {
            int s=0;
            int l=n-1;
            while(s<=l)
            {
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][l];
                matrix[i][l]=temp;
                s++;
                l--;
            }
        }
        
    }
}