class Triplet implements Comparable<Triplet>
{
    int dist;
    int x;
    int y;
    Triplet(int dist,int x ,int y)
    {
        this.dist=dist;
        this.x= x;
        this.y= y;
    }
    public int compareTo(Triplet t)
    {
        return Integer.compare(t.dist,this.dist);
    }
}


class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
        //okay here we are given with an array we need to return the array of the points whose distace from the origin is least 
        //here we need to use maxheap
        PriorityQueue<Triplet>pq= new PriorityQueue<>();    
        for (int[]point :points)
        {
            int x=point[0];
            int y= point[1];
            int dist= x*x+y*y;
            Triplet t= new Triplet(dist,x,y);
            pq.add(t);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        //till now we will have the req arrays in the heap we need to just pop those and add those to another array
        int[][] ans= new int [k][2];
        for(int i =0;i<k;i++)
        {
            Triplet top= pq.poll();
            ans[i][0]= top.x;
            ans[i][1]=top.y;
        }
        return ans;
    }
}