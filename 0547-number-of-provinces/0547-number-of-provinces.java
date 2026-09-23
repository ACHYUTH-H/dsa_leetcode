class Solution {

    private void dfs (int node , int [] [] isConnected,Set<Integer> visited)
    {
        visited.add(node);
        for(int a=0;a<isConnected[node].length;a++)
        {
            int curr= isConnected[node][a];
            if(curr==1 && !visited.contains(a))
            {
                dfs(a,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) 
    {
        //there are only three values in each row of the connected
        Set <Integer>visited= new HashSet<>();
        int provinces=0;

        for(int i =0;i<isConnected.length;i++)
        {
            if(!visited.contains(i))
            {
                dfs(i,isConnected,visited);
                provinces++;
            }

        }
        return provinces;
    }
}