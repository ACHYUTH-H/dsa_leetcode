class Solution {
    public int beautySum(String s) 
    {
        //okay now we might use the two piointer approach for this because we need to get substring 
        //putting it in hashmap and getting min adn max again and again is very tedious
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int l=i;
            HashMap<Character,Integer>map=new HashMap<>();
            // int max=0;
            // int min=100000000;
            for(int j=i;j<s.length();j++)
            {
               map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
               int mini=Integer.MAX_VALUE;
               int maxi=Integer.MIN_VALUE;
               for(int a:map.values())
               {
                mini=Math.min(mini,a);
                maxi=Math.max(maxi,a);
               }
               sum+=(maxi-mini);
            }
        }
        return sum;
        
    }
}