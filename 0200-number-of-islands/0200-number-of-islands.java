class Solution {
    private void dfs(int row,int col,char[][] grid)
    {
        //out of boundary
        if(row<0||row>=grid.length||col<0||col>=grid[0].length)
        {
            return;
        }
        //if the grid is 0
        if(grid[row][col]=='0')
        {
            return;
        }
        //marking the row as 0 means visited
        grid[row][col]='0';

        //up 
        dfs(row-1,col,grid);
        dfs(row+1,col,grid);
        dfs(row,col-1,grid);
        dfs(row,col+1,grid);
    }

    public int numIslands(char[][] grid) 
    {
        int count=0;

        for(int i =0 ;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
}