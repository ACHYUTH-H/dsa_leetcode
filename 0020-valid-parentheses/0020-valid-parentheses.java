
class Solution {
    public boolean isValid(String s) 
    {
        Deque<Character>stack=new ArrayDeque<>();
        int n= s.length();
        if(n<1)
        return false;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            
            if (s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            { if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if(((c==')')&&stack.peek()=='(') || ((c=='}')&&stack.peek()=='{') || ((c==']')&&stack.peek()=='['))
                stack.pop();
                else
                return false;
            }
            else
            {
                stack.push(s.charAt(i));
            }
            
        }

        return stack.isEmpty();
    }
}