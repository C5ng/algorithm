package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), i);
        }

        for (int i = 0; i < n; i++) {
            if (hm.get(br.readLine()) > i) {
                count++;
            }
        }

        System.out.print(count);
    }
}
