package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/11478 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                hm.put(s.substring(i, j), 1);
            }
        }

        System.out.print(hm.keySet().size());
    }
}
