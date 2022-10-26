package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/1157 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c < 97) {
                arr[c - 65]++;
            } else {
                arr[c - 97]++;
            }
        }

        int max = -1;
        char answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                answer = (char) (i + 65);
                max = arr[i];
            } else if (arr[i] == max) {
                answer = '?';
            }
        }

        System.out.print(answer);
    }
}
