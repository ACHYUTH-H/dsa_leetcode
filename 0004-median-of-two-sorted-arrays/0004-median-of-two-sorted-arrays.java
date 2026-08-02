class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums1.length>nums2.length)
        {
           return findMedianSortedArrays(nums2,nums1);
        }
        //calculate the lengths of each array
        int n1=nums1.length;
        int n2=nums2.length;
        int total=n1+n2;
        //now we have length and total we need to calculate which is mid meaning how much length should we consider for comparision
        int mid=total/2;
        int rest=total-mid;

        int low=0;
        int high=n1;
        //we are taking n1 becuase we dont need any outofbound errors

        while(low<=high)
        {
            int cut1=(low+high)/2;
            //cut2 depends on cut1 
            int cut2=(total+1)/2-cut1;
            int l1= cut1==0 ? -10000000 : nums1[cut1-1];
            int l2= cut2==0 ? -10000000 : nums2[cut2-1];
            int r1= cut1==n1 ? 1000000000 : nums1[cut1];
            int r2= cut2==n2 ? 1000000000 : nums2[cut2];

            if(l1<=r2 && l2<=r1)
            {
                if(total %2==0)
                {
                    
                     return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                    
                }
                else
                {
                 return Math.max(l1,l2);  
                }
            }
            else if(l1>r2)
            {
                high=cut1-1;
            }
            else
            {
                low=cut1+1;
            }

        }
     return -1;   
    }
}