class Solution {
    public boolean solve(int row,int col,int ind,char[][] board,String word)
    {   

        int m=board.length;
        int n=board[0].length;
        if(ind==word.length())
        {
            return true;
        }
        if(row<0||col<0||row>=m||col>=n||word.charAt(ind)!=board[row][col])
        {
            return false;
        }
        //mark cell visited
        char temp=board[row][col];
        board[row][col]='#';
        boolean ans=solve(row+1,col,ind+1,board,word)||
        solve(row-1,col,ind+1,board,word)||
        solve(row,col+1,ind+1,board,word)||
        solve(row,col-1,ind+1,board,word);
        //this is backtracking step
        board[row][col]=temp;
        return ans; 
        //need to understand why backtracking is very important in this
           
    }

    public boolean exist(char[][] board, String word) 
    {
        
        //for each position of array we can move down or up or left or right
        //for this we know that recursion and backtracking is the best solution
        //we will pass row ,column and index value /board to recursive function
        for (int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0) && solve(i,j,0,board,word))
                {
                    return true;
                }
            }
        }
         return false;
    }
}