package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/10809 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i) - 97] == -1) {
                arr[str.charAt(i) - 97] = i;
            }
        }

        for (int i : arr) {
            sb.append(i + " ");
        }

        System.out.print(sb.toString().trim());
    }
}
