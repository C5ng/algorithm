package bruteforce;

/* https://www.acmicpc.net/problem/1065 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;

            if (num < 100) {
                answer++;
                continue;
            }

            if (num / 100 + num % 10 == num / 10 % 10 * 2) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
