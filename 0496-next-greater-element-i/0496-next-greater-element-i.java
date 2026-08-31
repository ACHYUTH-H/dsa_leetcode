class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
     //as per the hint we got to know that we need to traverse from left to right 
     //okay we need to see the nums2 and mark the pos    

     int n=nums2.length;
     int [] nextGreater=new int[10001];
     Stack<Integer>st=new Stack<>();
     for(int i= n-1;i>=0;i--)
     {
        while(!st.isEmpty() && st.peek()<=nums2[i])
        {
            st.pop();
        }
        nextGreater[nums2[i]]=st.isEmpty()?-1:st.peek();
        st.push(nums2[i]);
     }
     for(int i =0;i<nums1.length;i++)
     {
        nums1[i]=nextGreater[nums1[i]];
     }
     return nums1;
    }
}