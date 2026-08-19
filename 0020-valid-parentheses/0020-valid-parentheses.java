import java.util.Stack;
class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character>stack=new Stack<>();
        int n= s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            { if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if(((c==')')&&stack.peek()=='(') || ((c=='}')&&stack.peek()=='{') || ((c==']')&&stack.peek()=='['))
                stack.pop();
                else
                return false;
            }
            
        }

        return stack.isEmpty();
    }
}