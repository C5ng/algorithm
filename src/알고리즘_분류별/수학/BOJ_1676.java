package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/1676 */
/* 5의 배수가 존재 할 경우에만 뒤가 0으로 끝나는 경우가 발생. 즉 10의 배수가 됨 (2는 반드시 있으니) 따라서 5의 개수만 알면 된다. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }

        System.out.print(count);
    }
}
