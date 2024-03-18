package heap;

/* https://www.acmicpc.net/problem/19638 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_19638 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            pq.add(n);
        }


        int answer = 0;
        for (int i = 0; i < T; i++) {
            Integer poll = pq.poll();

            if (H > poll) {
                pq.add(poll);
                break;
            }

            if (poll > 1) {
                poll /= 2;
                answer++;
            }

            pq.add(poll);
        }

        Integer poll = pq.poll();
        System.out.print(H > poll ? "YES\n" + answer : "NO\n" + poll);
    }
}
