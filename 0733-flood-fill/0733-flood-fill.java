class Solution {
    private void dfs(int[][] image, int sr, int sc, int color,int curr) 
    {
        if (sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]==color)
        {
            return ;
        }
        if(image[sr][sc]==curr){
        image[sr][sc]=color;
        //up
        dfs(image,sr-1,sc,color,curr);
        dfs(image,sr+1,sc,color,curr);
        dfs(image,sr,sc-1,color,curr);
        dfs(image,sr,sc+1,color,curr);
        }
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int curr= image[sr][sc];
        if(image[sr][sc]!=color)
        {
            dfs(image,sr,sc,color,curr);
        }

        return image;

        
    }
}