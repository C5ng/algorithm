package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/2004 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2004 {
    public static int twoPow(int n) {
        int answer = 0;

        while (n >= 2) {
            answer += n / 2;
            n /= 2;
        }

        return answer;
    }

    public static int fivePow(int n) {
        int answer = 0;

        while (n >= 5) {
            answer += n / 5;
            n /= 5;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int twoPow = twoPow(n) - twoPow(m) - twoPow(n - m);
        int fivePow = fivePow(n) - fivePow(m) - fivePow(n - m);

        System.out.print(twoPow > fivePow ? fivePow : twoPow);
    }
}
