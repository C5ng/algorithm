package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/5622 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int aC = (int) c - 65;

            if (aC >= 0 && aC <= 2) {
                answer += 3;
            } else if (aC >= 3 && aC <= 5) {
                answer += 4;
            } else if (aC >= 6 && aC <= 8) {
                answer += 5;
            } else if (aC >= 9 && aC <= 11) {
                answer += 6;
            } else if (aC >= 12 && aC <= 14) {
                answer += 7;
            } else if (aC >= 15 && aC <= 18) {
                answer += 8;
            } else if (aC >= 19 && aC <= 21) {
                answer += 9;
            } else if (aC >= 22 && aC <= 25) {
                answer += 10;
            }
        }
        System.out.println(answer);
    }
}
