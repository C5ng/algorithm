package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/1822 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int n = Integer.parseInt(st.nextToken());
            hm.put(n, 0);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (hm.containsKey(n)) {
                hm.remove(n);
            }
        }

        if (hm.keySet().size() != 0) {
            sb.append(hm.keySet().size() + "\n");

            Object[] arr = hm.keySet().toArray();
            Arrays.sort(arr);
            for (Object n : arr) {
                sb.append(n + " ");
            }

            System.out.print(sb);
        } else {
            System.out.print(0);
        }
    }
}
