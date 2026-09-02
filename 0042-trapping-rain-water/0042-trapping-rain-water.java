import java.util.*;
//here usage of the monotonic stack is unnessary but okay we know now how to use this also here

class Solution {
    public int trap(int[] height) 
    {
    //as long as we got to know this is a monotonic stack problem 
    int n= height.length;
    Stack <Integer>pre= new Stack <>();
   
    int count =0;
    Stack <Integer>suf= new Stack<>();
    //now we need prefix max and suffix max
    int[] prefix=new int[n];
    int[] suffix=new int[n];
    //for prefix we will go from left to right 
    //for suffix we will go from right to left
    for (int i =0;i<n;i++)
    {
        if(pre.isEmpty())
        {
            pre.push(height[i]);
        }
        else if(height[i]>pre.peek())
        {
            pre.push(height[i]);
        }
        prefix[i]=pre.peek();
    }
    for (int i=n-1;i>=0;i--)
    {
        if(suf.isEmpty())
        {
            suf.push(height[i]);
        }
        else if(height[i]>suf.peek())
        {
            suf.push(height[i]);
        }
        suffix[i]=suf.peek();
    }


    for(int i =0;i<n;i++)
    {
        
            count +=Math.min(prefix[i],suffix[i])-height[i];
        
    }

    return count;
        
    }
}