class Solution {
    class Pair {
    int count;
    int availableTime;

    Pair(int count, int availableTime) {
        this.count = count;
        this.availableTime = availableTime;
    }
    }
    public int leastInterval(char[] tasks, int n) 
    {
        //okay get the intitution for what we need to solve
        //we need a heap a maxheap and a queue
        //we need to count each element how much it is occuring and add it to the heap 
        //iterate and poll the heap and reduce one and add the time to and n value to the actual returnable value and return it 
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int clock=0;
        Queue<Pair> q = new LinkedList<>();
        //should we use hashmap to find the frequency
        HashMap <Character,Integer>map = new HashMap<>();
        for (char ele:  tasks)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        //now we have the elements and its values
        Set<Character>keys= map.keySet();
        for(char key:keys)
        {
            pq.add(map.get(key));
        }   

        while(!pq.isEmpty() || !q.isEmpty())
        {
            clock++;
             if(!q.isEmpty() && q.peek().availableTime<=clock)
            {
                pq.add(q.remove().count);
            }
            
            if(!pq.isEmpty()){
            int ele=pq.poll()-1;
            Pair temp= new Pair(ele,clock+n+1);

            
            if(ele>0)
            {
            q.add(temp); 
            }
            }
           
        }

        return clock;
    }
}