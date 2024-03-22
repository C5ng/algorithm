package hash;

/* https://www.acmicpc.net/problem/7785 */
/* TreeSet 사용 ? */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String command = st.nextToken();

            if (command.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        Object[] arr = set.toArray();
        Arrays.sort(arr, Collections.reverseOrder());
        for (Object str : arr) {
            System.out.println(str);
        }
    }
}
