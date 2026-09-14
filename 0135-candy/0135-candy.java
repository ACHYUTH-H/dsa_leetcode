class Solution {
    public int candy(int[] ratings) 
    {
     int n =ratings.length;
     int [] look=new int[n];
     //int [] look_right=new int[n];

     //first we iteate over the loop and put the left
     for(int i=0;i<n;i++)
     {
        look[i]=1;
        if(i-1>=0 && ratings[i-1]<ratings[i])
        {
            look[i]=look[i-1]+1;
        }
     }

     //iterating from right for right look

     for(int i=n-2;i>=0;i--)
     {
        if(ratings[i]>ratings[i+1])
        { 
            look[i] = Math.max(look[i], look[i + 1] + 1);
        }
     }
     int sum=0;
     for(int i =0;i<n;i++)
     {
        sum+=look[i];
     }
    return sum;
    }
}