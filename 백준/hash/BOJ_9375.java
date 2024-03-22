package hash;

/* https://www.acmicpc.net/problem/9375 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String str = st.nextToken();

                map.put(str, map.getOrDefault(str, 0) + 1);
            }

            long answer = 1;
            for (String str : map.keySet()) {
                answer *= (map.get(str) + 1);
            }

            System.out.println(answer - 1);
        }
    }
}
