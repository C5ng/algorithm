package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/11720 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }

        System.out.print(answer);
    }
}
