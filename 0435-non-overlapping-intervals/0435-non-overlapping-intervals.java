class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
    int n = intervals.length;
    //for each element we need to find which one is ending soon and keep it and delete all the other overlapping samples
    Arrays.sort(intervals,(a,b)->a[1]-b[1]);
    int count=1;
    int prev_interval=0;
    for(int i =0;i<n;i++)
    {
        if(intervals[i][0]>=intervals[prev_interval][1])
        {
            //there is no overlap
            count++;
            prev_interval=i;
        }
    }
    return n-count;
    }
}