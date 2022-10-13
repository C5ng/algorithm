package 해시;

/* https://www.acmicpc.net/problem/1764 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), 1);
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                count++;
                arr.add(entry.getKey());
            }
        }

        Collections.sort(arr);

        System.out.println(count);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
