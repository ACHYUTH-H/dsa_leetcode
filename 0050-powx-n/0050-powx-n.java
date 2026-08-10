class Solution {
    public double myPow(double x, int n) 
    {
        if(x==1)return x;
        long power=n;
    if(n==0)
    {
        return 1;
    }    
    if(n<0)
    {
        power=-n;
        return 1/myPowhelper(x,-power);
    }

    return myPowhelper(x,power);

    }
    private double myPowhelper(double x, long n)
    {
        if(n==0)
        {
            return 1;
        }
        double temp=myPowhelper(x,n/2);
        if(n%2==0)
        {
            return temp*temp;
        }
        return x*temp*temp;
    }
}