package sort;

/* https://www.acmicpc.net/problem/11497 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int[] tree = new int[N];

            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) {
                    tree[j / 2] = arr[j];
                } else {
                    tree[tree.length - 1 - j / 2] = arr[j];
                }
            }

            int max = 0;
            for (int j = 0; j < N - 1; j++) {
                max = Math.max(Math.abs(tree[j + 1] - tree[j]), max);
            }

            System.out.println(max);
        }

    }
}
