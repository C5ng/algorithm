package sort;

/* https://www.acmicpc.net/problem/1946 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int score1 = Integer.parseInt(st.nextToken());
                int score2 = Integer.parseInt(st.nextToken());
                arr[j] = new int[]{score1, score2};
            }
            Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

            int max = arr[0][1];
            int result = 1;

            for (int j = 1; j < N; j++) {
                if (max > arr[j][1]) {
                    result++;
                    max = arr[j][1];
                }
            }

            System.out.println(result);
        }
    }
}
