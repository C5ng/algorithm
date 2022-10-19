package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/1269 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int n = Integer.parseInt(st.nextToken());
            hm.put(n, 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (hm.containsKey(n)) {
                hm.remove(n);
            } else {
                hm.put(n, 1);
            }
        }

        System.out.print(hm.size());
    }
}
