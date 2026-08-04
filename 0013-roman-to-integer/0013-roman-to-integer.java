class Solution {
    private int value (char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) 
    {
        //now we are converting the roman to int
        // okay if the smaller number comes before larger then just decrease the value from larger or else just add the larger
        // HashMap<Character,Integer> map=new HashMap<>();
        // map.put('I',1);
        // map.put('V',5);
        // map.put('X',10);
        // map.put('L',50);
        // map.put('C',100);
        // map.put('D',500);
        // map.put('M',1000);

        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && value(s.charAt(i))<value(s.charAt(i+1)) )
            {
                ans=ans+(value(s.charAt(i+1))-value(s.charAt(i)));
                i++;
            }
            else
            {
                ans= ans + value(s.charAt(i));
            }
        }
     return ans;   
    }
}