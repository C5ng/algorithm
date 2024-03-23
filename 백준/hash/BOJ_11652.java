package hash;

/* https://www.acmicpc.net/problem/11652 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        Integer maxValue = Collections.max(hm.values());
        ArrayList<Long> arr = new ArrayList<>();

        for (Map.Entry<Long, Integer> entry : hm.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                arr.add(entry.getKey());
            }
        }

        Collections.sort(arr);
        System.out.println(arr.get(0));
    }
}
