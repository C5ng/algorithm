package hash;

/* https://www.acmicpc.net/problem/25192 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int result = 0;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String action = br.readLine();

            if (action.equals("ENTER")) {
                result += set.size();
                set.clear();
                continue;
            }

            set.add(action);
        }

        result += set.size();
        System.out.print(result);
    }
}
