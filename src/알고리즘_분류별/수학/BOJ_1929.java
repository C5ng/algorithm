package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/1929 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[1000001];
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr[1] = true;

        for (int i = 2; i <= m; i++) {
            if (arr[i]) {
                continue;
            }

            for (int j = i * 2; j <= m; j += i) {
                arr[j] = true;
            }
        }

        for (int i = n; i <= m; i++) {
            if (!arr[i]) {
                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}
