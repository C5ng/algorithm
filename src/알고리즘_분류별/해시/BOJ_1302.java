package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/1302 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int max = 0;
        String book = null;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        Object[] arr = hm.keySet().toArray();
        Arrays.sort(arr);
        for (Object object : arr) {
            if (hm.get(object) > max) {
                max = hm.get(object);
                book = object.toString();
            }
        }

        System.out.print(book);
    }
}
