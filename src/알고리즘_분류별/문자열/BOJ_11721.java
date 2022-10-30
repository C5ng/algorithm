package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/11721 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.charAt(i - 1));

            if (i % 10 == 0) {
                System.out.println(sb);
                sb = new StringBuilder();
            }
        }

        System.out.print(sb.length() > 0 ? sb : "");
    }
}
