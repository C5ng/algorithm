package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/1934 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int mulitple = 1;

            for (int j = a; j > 1; j--) {
                if (a % j == 0 && b % j == 0) {
                    mulitple *= j;
                    a /= j;
                    b /= j;
                }
            }
            mulitple = mulitple * a * b;
            sb.append(mulitple + "\n");
        }

        System.out.print(sb);
    }
}
