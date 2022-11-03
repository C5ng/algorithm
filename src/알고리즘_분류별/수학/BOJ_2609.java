package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/2609 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int divisor = 1;
        int multiple = 1;
        for (int i = n; i > 1; i--) {
            if (n % i == 0 && m % i == 0) {
                divisor *= i;
                multiple *= i;
                n /= i;
                m /= i;
            }
        }
        multiple = multiple * n * m;

        System.out.print(divisor + "\n" + multiple);
    }
}
