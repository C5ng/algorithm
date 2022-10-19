package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/1620 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            hm.put(name, String.valueOf(i));
            hm.put(String.valueOf(i), name);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(hm.get(br.readLine()));
        }
    }
}
