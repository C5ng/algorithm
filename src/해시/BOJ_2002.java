package 해시;

/* https://www.acmicpc.net/problem/2002 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), i);
        }

        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = hm.get(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (out[i] > out[j]) {
                    answer++;
                    break;
                }
            }
        }

//        for (int i = 0; i < n; i++) {
//            String str = br.readLine();
//            if (hm.get(str) == count) {
//                count++;
//            } else {
//                answer++;
//            }
//        }

        System.out.print(answer);

    }
}
