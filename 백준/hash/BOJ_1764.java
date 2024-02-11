package hash;

/* https://www.acmicpc.net/problem/1764 */
/* Collections.sort 사용하지 않고 TreeMap 사용 ? */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int count = 0;
        ArrayList<String> arr = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                count++;
                arr.add(entry.getKey());
            }
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str + "\n");
        }

        System.out.println(count);
        System.out.print(sb);
    }
}
