package hash;

/* https://www.acmicpc.net/problem/14425 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            set.add(str);
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            if (set.contains(str)) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
