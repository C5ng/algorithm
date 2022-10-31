package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/10872 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 1;

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }

        System.out.print(answer);
    }
}
