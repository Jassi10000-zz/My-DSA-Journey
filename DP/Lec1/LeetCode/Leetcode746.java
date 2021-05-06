class Leetcode746{
    

    //Memoization method
    public int minCostClimbingStairs(int[] cost, int n , int[] dp) {
        
        if(n <= 1){
            return dp[n] = cost[n];
        }
        
        if(dp[n] != 0){
            return dp[n];
        }
        
        int minCostOfOneStep = minCostClimbingStairs(cost,n-1,dp);
        int minCostOfTwoStep = minCostClimbingStairs(cost,n-2,dp);
        
        int ans = Math.min(minCostOfOneStep,minCostOfTwoStep) + (n != cost.length ? cost[n] : 0);
        
        return dp[n] = ans;
    }

    //Tabulation Method
    public int minCostClimbingStairs(int[] cost, int N , int[] dp) {
        
       for(int n=0;n<=N;n++){
        if(n <= 1){
            dp[n] = cost[n];
            continue;
        }
        
        int minCostOfOneStep = dp[n-1];
        int minCostOfTwoStep = dp[n-2];
        
        int ans = Math.min(minCostOfOneStep,minCostOfTwoStep) + (n != cost.length ? cost[n] : 0);
        
        return dp[n] = ans;
       }

       return dp[N];
    }

    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] dp = new int[n+1];
        
        int ans = minCostClimbingStairs(cost,n,dp);
        
        return ans;
        
    }
    
    
}