package bruteforce;

/* https://www.acmicpc.net/problem/1436 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 666;
        while (count != N) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }

            if (count == N) {
                System.out.print(num);
                break;
            }

            num++;
        }
    }
}
