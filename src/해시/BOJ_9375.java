package 해시;

/* https://www.acmicpc.net/problem/9375 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
                int sum = 0;
                int count = 1;
                int n = Integer.parseInt(br.readLine());

                for (int j = 0; j < n; j++) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    st.nextToken();
                    String str = st.nextToken();
                    hm.put(str, hm.getOrDefault(str, 0) + 1);
                }

                for (int j : hm.values()) {
                    count = count * (j + 1);
                }
                sum = sum + count - 1;

            System.out.println(sum);
            hm.clear();
        }
    }
}
