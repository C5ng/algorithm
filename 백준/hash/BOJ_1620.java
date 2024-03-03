package hash;

/* https://www.acmicpc.net/problem/1620 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            map.put(String.valueOf(i), pokemon);
            map.put(pokemon, String.valueOf(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String pokemon = br.readLine();
            sb.append(map.get(pokemon) + "\n");
        }

        System.out.print(sb);
    }
}
