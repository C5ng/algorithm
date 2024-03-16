package dp;

/* https://www.acmicpc.net/problem/1003 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003 {
    static Integer[] dp0 = new Integer[41];
    static Integer[] dp1 = new Integer[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp0[0] = dp1[1] = 1;
        dp0[1] = dp1[0] = 0;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(count0(N) + " " + count1(N));
        }
    }

    public static int count0(int N) {
        if (dp0[N] == null) {
            dp0[N] = count0(N - 1) + count0(N - 2);
        }

        return dp0[N];
    }

    public static int count1(int N) {
        if (dp1[N] == null) {
            dp1[N] = count1(N - 1) + count1(N - 2);
        }

        return dp1[N];
    }
}
