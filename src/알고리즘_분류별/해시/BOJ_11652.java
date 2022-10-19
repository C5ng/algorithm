package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/11652 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_11652 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        HashMap<Long, Integer> hm = new HashMap<>();
        long max = 0;
        long answer = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long m = sc.nextLong();
            hm.put(m, hm.getOrDefault(m, 0) + 1);
        }

        for (Map.Entry<Long, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            } else if (entry.getValue() == max && entry.getKey() < answer) {
                answer = entry.getKey();
            }
        }

        System.out.print(answer);
    }
}
