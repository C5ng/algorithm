package sort;

/* https://www.acmicpc.net/problem/2470 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int value = 2000000000; // 최대값 20억
        int min = 0;
        int max = 0;
        while (start < end) {
            int curValue = arr[start] + arr[end];

            if (Math.abs(curValue) < value) {
                value = Math.abs(curValue);
                min = arr[start];
                max = arr[end];
            }

            if (curValue == 0) {
                break;
            } else if (curValue > 0) {
                end--;
            } else if (curValue < 0) {
                start++;
            }
        }

        System.out.print(min + " " + max);
    }
}
