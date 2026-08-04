class Solution {
    public int maxDepth(String s) 
    {
        //okay this we need to put a counter and when we encounter ( we need to increment and when ) is there we need to decrement
        int count=0;
        int max=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else if(c==')')
            {
                count--;
            }
            else
            {
                continue;
            }
        }
        return max;
    }
}