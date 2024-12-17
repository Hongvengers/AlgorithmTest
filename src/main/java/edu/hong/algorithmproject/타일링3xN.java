package edu.hong.algorithmproject;

public class 타일링3xN {
    public int solution(int n) {
        final int val = 1_000_000_007;

        if (n % 2 == 1) {
            return 0;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[2] = 3;
        // dp[4] = 11
        // dp[6] = 41
        // dp[8] = 153

        int memo = 0;

        for (int i = 4; i <= n; i += 2) {
            memo = (memo + dp[i - 4]) % val;
            dp[i] = (dp[i - 2] * 3 + memo * 2) % val;
        }

        return dp[n];
    }
}
