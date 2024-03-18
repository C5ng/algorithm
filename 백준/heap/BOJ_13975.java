package heap;

/* https://www.acmicpc.net/problem/13975 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Long> pq = new PriorityQueue<>();
            for (int j = 0; j < K; j++) {
                Long cost = Long.parseLong(st.nextToken());
                pq.add(cost);
            }

            Long answer = 0L;
            while (pq.size() != 1) {
                Long poll1 = pq.poll();
                Long poll2 = pq.poll();

                pq.add(poll1 + poll2);
                answer += poll1 + poll2;
            }

            System.out.println(answer);
        }
    }
}
