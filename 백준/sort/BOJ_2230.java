package sort;

/* https://www.acmicpc.net/problem/2230 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int start = 0, end = 0, min = 2_000_000_000;

        while (start <= end && end < arr.length) {
            int sum = arr[end] - arr[start];

            if (sum < M) {
                end++;
                continue;
            }

            min = Math.min(sum, min);
            start++;
        }

        System.out.print(min);
    }
}