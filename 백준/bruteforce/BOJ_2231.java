package bruteforce;

/* https://www.acmicpc.net/problem/2231 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = i;
            int sum = n;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            if (sum == N) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}
