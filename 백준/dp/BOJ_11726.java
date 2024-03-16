package dp;

/* https://www.acmicpc.net/problem/11726 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        System.out.print(solution(n) % 10007);
    }

    public static int solution(int n) {
        if (dp[n] == null) {
            dp[n] = solution(n - 2) + solution(n - 1) % 10007;
        }

        return dp[n];
    }
}
