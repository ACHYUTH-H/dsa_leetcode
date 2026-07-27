class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
     ArrayList<Integer>list=new ArrayList<>();  
    int m=matrix.length;
    int n=matrix[0].length; 
    int top=0;
    int bottom=m-1;
    int left=0;
    int right=n-1;
    int ind=0;
    while(left<=right&&top<=bottom)
    {
        if(ind==0)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);

            }
            top++;
            ind=1;
        }
       else if(ind==1)
        {
            for(int i=top;i<=bottom;i++)
            {
                list.add(matrix[i][right]);

            }right--;
            ind=2;
        }
       else if(ind==2)
        {
            for(int i=right;i>=left;i--)
            {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            ind=3;
        }
       else if(ind==3)
        {
            for(int i=bottom;i>=top;i--)
            {
                list.add(matrix[i][left]);
            }
            left++;
            ind=0;
        }

    }
    

     return list;
    }
}