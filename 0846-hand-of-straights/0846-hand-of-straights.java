class Solution 
{
    public boolean isNStraightHand(int[] hand, int k) 
    {
        HashMap <Integer,Integer> map= new HashMap<>();
        PriorityQueue <Integer> pq= new PriorityQueue<>();
        int n = hand.length;
        for(int ele:hand)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int key:map.keySet())
        {
            pq.add(key);
        }
        while(!pq.isEmpty())
        {
            while (!pq.isEmpty() && map.get(pq.peek()) == 0)
               { pq.poll();}
           if(pq.isEmpty())
           {
            break;
           }
           int ele= pq.peek();

            for(int i =0;i<k;i++)
            {
                int curr=ele+i;
                if(map.getOrDefault(curr,0)==0)
                 return false;
                map.put(curr,map.get(curr)-1);
                
            }

        
        }
        return true;
    }
}