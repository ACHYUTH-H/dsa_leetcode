class Solution {
    public List<String> generateParenthesis(int n) 
    {
       //okay we are gonna solve this using recursion where we needs 
       //we need to have same open parenthesis and same n closing parenthesis
       //closing condition should be close < open insert close or insert open
    
        List<String> res=new ArrayList<String>();
        recurse(res,0,0,"",n);
        return res;
    
    }
    public void recurse(List<String>res,int left,int right,String s,int n)
    {
        if(s.length()==n*2)
        {
            res.add(s);
            return;
        }
        if(left<n)
        {
            recurse(res,left+1,right,s+"(",n);
        }
        if(right<left)
        {
            recurse(res,left,right+1,s+")",n);
        }
    }
}