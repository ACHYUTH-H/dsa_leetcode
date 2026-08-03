class Solution {
    public boolean rotateString(String s, String goal) 
    {
     String doub= s+s;
     
     int slen=s.length();
     int glen=goal.length();
     if(slen!=glen)
     {return false;}
     int n=doub.length();
     for(int i=0;i<slen;i++)
     {
        if(doub.substring(i,i+slen).equals(goal))
        {
            return true;
        }
     }   
     return false;
    }
}