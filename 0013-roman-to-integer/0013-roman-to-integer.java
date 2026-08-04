class Solution {
    public int romanToInt(String s) 
    {
        //now we are converting the roman to int
        // okay if the smaller number comes before larger then just decrease the value from larger or else just add the larger
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1)) )
            {
                ans=ans+(map.get(s.charAt(i+1))-map.get(s.charAt(i)));
                i++;
            }
            else
            {
                ans= ans + map.get(s.charAt(i));
            }
        }
     return ans;   
    }
}