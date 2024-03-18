package sort;

/* https://www.acmicpc.net/problem/2212 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[] interval = new int[N - 1];
        for (int i = 0; i < interval.length; i++) {
            interval[i] = arr[i + 1] - arr[i];
        }

        Arrays.sort(interval);
        int answer = 0;
        for (int i = 0; i < N - K; i++) {
            answer += interval[i];
        }

        System.out.print(answer);
    }
}
