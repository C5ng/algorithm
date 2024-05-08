package hash;

/* https://www.acmicpc.net/problem/2015 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sum = new int[N + 1];
        Map<Integer, Integer> map = new HashMap<>();

        long result = 0;
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());

            if (sum[i] == K) {
                result++;
            }

            result += map.getOrDefault(sum[i] - K, 0);
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);
        }

        System.out.print(result);
    }
}
