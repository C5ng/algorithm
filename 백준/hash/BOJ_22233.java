package hash;

/* https://www.acmicpc.net/problem/22233 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer keyword = new StringTokenizer(br.readLine(), ",");
            int length = keyword.countTokens();

            for (int j = 0; j < length; j++) {
                String str = keyword.nextToken();

                if (set.contains(str)) {
                    set.remove(str);
                }
            }

            System.out.println(set.size());
        }
    }
}

