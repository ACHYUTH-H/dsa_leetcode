
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
            
            if (c==')'||c=='}'||c==']')
            { if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if(((c==')')&&top=='(') || ((c=='}')&&top=='{') || ((c==']')&&top=='['))
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