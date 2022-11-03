package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/6588 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[1000001];
        StringBuilder sb = new StringBuilder();

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= arr.length - 1; i++) {

            if (arr[i]) {
                continue;
            }

            for (int j = i * 2; j <= arr.length - 1; j += i) {
                arr[j] = true;
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            boolean flag = true;

            if (n == 0) {
                break;
            }

            for (int i = n; i >= 2; i--) {
                if (!arr[i] && !arr[n - i]) {
                    sb.append(n + " = " + (n - i) + " + " + i + "\n");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("Goldbach's conjecture is wrong." + "\n");
            }
        }

        System.out.print(sb);
    }
}
