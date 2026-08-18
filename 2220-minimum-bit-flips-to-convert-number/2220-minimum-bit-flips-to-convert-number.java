class Solution {
    public int minBitFlips(int start, int goal) 
    {
        //how does flipping works we need to do 
        //okay we need to reduce or increase the number using bit
        int ans=start^goal;
        int count=0;
        //now we need to count number digits having one
        while(ans>0)
        {
            if((ans&1)==1)
            {
                count++;
            }
            ans=ans>>1;
        }
        return count;
    }
}