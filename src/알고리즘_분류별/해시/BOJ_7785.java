package 알고리즘_분류별.해시;

/* https://www.acmicpc.net/problem/7785 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        StringTokenizer st;
        ArrayList<String> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if (st.nextToken().equals("enter")) {
                hm.put(name, 0);
            } else {
                hm.remove(name);
            }
        }

        for (Map.Entry<String, Integer> entrySet : hm.entrySet()) {
            arr.add(entrySet.getKey());
        }

        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
