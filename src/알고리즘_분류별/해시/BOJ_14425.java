package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/14425 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), 0);
        }

        for (int i = 0; i < m; i++) {
            if (hm.containsKey(br.readLine())) {
                count++;
            }
        }

        System.out.print(count);

    }
}
