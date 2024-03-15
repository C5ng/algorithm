package dp;

/* https://www.acmicpc.net/problem/2839 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        if (N == 4 || N == 7) {
            result = -1;
        } else if (N % 5 == 0) {
            result = N / 5;
        } else if (N % 5 == 1 || N % 5 == 3) {
            result = N / 5 + 1;
        } else if (N % 5 == 4 || N % 5 == 2) {
            result = N / 5 + 2;
        } else {
            result = -1;
        }

        System.out.print(result);
    }
}
