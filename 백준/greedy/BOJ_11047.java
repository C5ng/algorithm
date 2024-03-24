package greedy;

/* https://www.acmicpc.net/problem/11047 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = coin.length - 1; i >= 0; i--) {
            if (coin[i] <= K) {
                answer += K / coin[i];
                K %= coin[i];
            }

            if (K == 0) {
                break;
            }
        }

        System.out.print(answer);
    }
}
