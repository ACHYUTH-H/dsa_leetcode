class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        // Using a boolean array is faster and uses less memory than an int array
        boolean[] notPrime = new boolean[n];
        int count = 0;
        
        // Loop only up to sqrt(n)
        for (int i = 2; i * i < n; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        
        // Count remaining primes
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}