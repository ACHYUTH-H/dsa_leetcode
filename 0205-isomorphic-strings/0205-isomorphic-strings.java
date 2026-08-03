class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
     //
     int n=s.length();
     int m=t.length();
     if(n!=m)
     {
        return false;
     }   
     else
     {
        int[] ans= new int[n];
        int[] ind1=new int[150];
        int[] ind2=new int[150];
        for(int i=0;i<n;i++)
        {
            if(ind1[s.charAt(i)]!=ind2[t.charAt(i)])
            {
                return false;
            }
            ind1[s.charAt(i)]=i+1;
            ind2[t.charAt(i)]=i+1;

        }
        return true;
        
     }
    }
}