class Solution {
    static final long mod=1000000007;
    private long pow(long base,long exponent)
    {
        if(exponent==0)
        {
            return 1;
        }
        long temp=pow(base,exponent/2);
        if(exponent%2==0)
        {
            return (temp*temp)%mod;
        }
        return (base*(temp%mod)*temp)%mod;
    }
    public int countGoodNumbers(long n) 
    {
        
    //understanding the solution we have to find if even place we need to return 5 or else if it odd we need to return 4
    if(n==1)
    {
        return 5;
    }    
    long even=(n+1)/2;
    long odd=n/2;
    //answer will be longans of even(5 power)and odd(4 power)
    long evenans=pow(5,even);
    long oddans=pow(4,odd);
    return (int)((evenans*oddans) %mod);
    }
}