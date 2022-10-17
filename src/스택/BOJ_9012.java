package 스택;

/* https://www.acmicpc.net/problem/9012 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    count++;
                } else if (str.charAt(j) == ')') {
                    count--;
                    if (count < 0) {
                        break;
                    }
                }
            }
            if (count == 0) {
                sb.append("YES" + "\n");
            } else {
                sb.append("NO" + "\n");
            }

            count = 0;
        }

        System.out.print(sb);
    }
}
