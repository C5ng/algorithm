package hash;

/* https://www.acmicpc.net/problem/13414 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < L; i++) {
            String str = br.readLine();

            if (set.contains(str)) {
                set.remove(str);
            }

            set.add(str);
        }

        int i = 0;
        for (String str : set) {
            System.out.println(str);
            i++;

            if (i == K) {
                break;
            }
        }
    }
}
