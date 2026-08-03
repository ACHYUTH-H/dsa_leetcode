class Solution {
    public List<List<Integer>> generate(int numRows) {
        //here we are given 
        if(numRows==0)
        return new ArrayList<>();
        if(numRows==1)
        {
            List<List<Integer>>result=new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        
        List<List<Integer>>ans=new ArrayList<>();
        ans.add(Arrays.asList(1));//adding first row
        List<Integer>newRow= new ArrayList<>();
        for(int i=1;i<numRows;i++)
        {
            List<Integer>prev_row=ans.get(i-1);//this gives entire row as the output so store it in list
            List<Integer>row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(prev_row.get(j-1)+prev_row.get(j));

            }
            row.add(1);
            ans.add(row);
        }
    return ans;
        
    }
}