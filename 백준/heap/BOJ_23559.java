package heap;

/* https://www.acmicpc.net/problem/23559 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_23559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, ((int[] o1, int[] o2) -> {
            if (Math.abs(o1[0] - o1[1]) == Math.abs(o2[0] - o2[1])) {
                if (o2[1] < o1[1]) {
                    return -1;
                }
            } else if (Math.abs(o2[0] - o2[1]) - Math.abs(o1[0] - o1[1]) < 0) {
                return -1;
            }

            return 1;
        }));

        for (int i = 0; i < arr.length; i++) {
            if (X >= 5000 + (N - 1) * 1000) {
                if (arr[i][0] > arr[i][1]) {
                    X -= 5000;
                    answer += arr[i][0];
                    N--;
                    continue;
                }
            }

            X -= 1000;
            N--;
            answer += arr[i][1];
        }



        System.out.print(answer);
    }
}
