class Solution {
    public int[] asteroidCollision(int[] ast) 
    {
        int n = ast.length;
        Stack<Integer>st= new Stack<>();
        for(int a: ast)
        {
            boolean dest=false;
            //try doing loop to pop elements when positive is there in stack and negative encountered
            while(!st.isEmpty()&& st.peek()>0 && a<0)
            {
                if(st.peek()<-a)
                {
                    st.pop();
                }
                else if(st.peek()==-a)
                {
                    st.pop();
                    dest=true;
                    break;
                }
                else
                {
                    dest=true;
                    break;
                }
            } 
            if(!dest)
            {
                st.push(a);
            }
        }

        int[] ans= new int[st.size()];
        for(int i =st.size()-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;


    }
}