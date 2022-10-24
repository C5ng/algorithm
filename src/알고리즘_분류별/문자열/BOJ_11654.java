package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/11654 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.print((int) str.charAt(0));
    }
}
