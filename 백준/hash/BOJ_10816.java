package hash;

/* https://www.acmicpc.net/problem/10816 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer nSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(nSt.nextToken());

            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer mSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(mSt.nextToken());

            sb.append(hm.getOrDefault(num, 0) + " ");
        }

        System.out.print(sb);
    }
}
