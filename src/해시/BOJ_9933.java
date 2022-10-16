package 해시;

/* https://www.acmicpc.net/problem/9933 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int length = 0;
        String sen = null;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder(str);
            String revStr = sb.reverse().toString();

            if (str.equals(revStr)) {
                sen = str;
                length = str.length();
                break;
            }

            if (!hm.containsKey(revStr)) {
                hm.put(str, 0);
            } else {
                sen = str;
                length = str.length();
                break;
            }
        }

        System.out.print(length + " " + sen.substring(length/2, length/2 + 1));
    }
}
