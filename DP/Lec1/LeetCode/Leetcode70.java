class leetcode70 {
    
   
    //memoization method
   public int climbStairs(int n, int[] dp) {
       
       if(n <= 1){
          return dp[n] = 1;
       }
       
       if(dp[n] != 0) return dp[n];
       
       int steps = climbStairs(n-1,dp) + climbStairs(n-2,dp);
       
       return dp[n] = steps;
   }
   
   //tabulation method
   public int climbStairs_dp(int N, int[] dp) {
       
       for(int n = 0 ; n <= N ;n++){
           if(n <= 1){
              dp[n] = 1;
               continue;
           }
       
           int steps = dp[n-1 ] + dp[n-2];
       
           dp[n] = steps;
       }
       
       return dp[N];
   }
   
   //optimization method
   public int climbStairs_opti(int n){
      int a = 1, b = 1;
       for (int i = 0; i < n; i++) {
           int sum = a + b;
           a = b;
           b = sum;
       }
       return a;
   }

   public int climbStairs(int n){
       
       int[] dp = new int[n+1];
       // int ans = climbStairs_dp(n,dp);
       int ans = climbStairs_opti(n);

       
       return ans;
   }
}