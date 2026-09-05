class Solution {
    public int largestRectangleArea(int[] heights) 
    {
    //here we need to use monotonic stack lets now understand the problem
    //okay based on the intitution we need to have next smaller element and previous smaller element
    int n=heights.length;
    Stack<Integer>nse = new Stack<>();
    //List<Integer>next= new ArrayList<>();
    List<Integer> next = new ArrayList<>(Collections.nCopies(n, 0));
    List <Integer>prev=new ArrayList<>();
    Stack<Integer>pse=new Stack<>();
   
    for(int i =0;i<n;i++)
    {
        int a= heights[i];
        while(!pse.isEmpty() && heights[pse.peek()]>=a)
        {
            pse.pop();
        }
       if(pse.isEmpty())
       {
        prev.add(-1);
       }
       else
       {
        prev.add(pse.peek());
       }
       pse.push(i);
    }

    for(int i=n-1;i>=0;i--)
    {
        int a = heights[i];
        while(!nse.isEmpty() && heights[nse.peek()]>=a)
        {
            nse.pop();
        }
       
       if(nse.isEmpty())
       {
        next.set(i, n);
       }
       else
       {
        next.set(i, nse.peek());
       }
        nse.push(i);
    }
    // int[] p=prev.toArray();
    // int[]p=next.toArray();
    int amax=0;
        for (int i=0 ;i<n;i++)
        {
            int width= next.get(i)-prev.get(i)-1;
            int area= width*heights[i];
            amax=Math.max(amax,area);
        }

        return amax;

    }
}