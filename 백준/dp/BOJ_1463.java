package dp;

/* https://www.acmicpc.net/problem/1463 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;
        System.out.print(solution(N));
    }

    public static int solution(int N) {

        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(Math.min(solution(N / 2), solution(N / 3)), solution(N - 1)) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(solution(N / 3), solution(N - 1)) + 1;
            } else if (N % 2 == 0) {
                dp[N] = Math.min(solution(N / 2), solution(N - 1)) + 1;
            } else {
                dp[N] = solution(N - 1) + 1;
            }
        }

        return dp[N];
    }
}
