package dp;

/* https://www.acmicpc.net/problem/9095 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095 {
    static Integer[] dp = new Integer[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(solution(n));
        }
    }

    public static int solution(int n) {
        if (dp[n] == null) {
            dp[n] = solution(n - 3) + solution(n - 2) + solution(n - 1);
        }

        return dp[n];
    }
}
