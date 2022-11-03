package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/1978 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());

            if (m == 1) {
                continue;
            }

            boolean flag = true;

            for (int j = 2; j < m; j++) {
                if (m % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
