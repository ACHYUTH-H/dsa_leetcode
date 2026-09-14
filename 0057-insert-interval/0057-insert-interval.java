class Solution {
    
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        //okay now we need to find where we can insert the interval(new)
        List<int[]> result = new ArrayList<>();
        int n =intervals.length;
        int i =0;
        //intervals which are completed before new one starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        //merge the overlapping intervals which is said when the new interval ending index is greater or equal to the start index 
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
         while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}