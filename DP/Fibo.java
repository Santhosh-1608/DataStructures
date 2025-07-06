// fibonacci numbers using dynamic programming Memoization method 
// TC - O(N)
// SC - O(N) + O(N)

import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        int n = 50;
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fi(n,dp));        
    }
    static long fi(int n,long[] dp){
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fi(n-1,dp)+fi(n-2,dp);
    }
}
