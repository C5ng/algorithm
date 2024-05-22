package queue;

/* https://www.acmicpc.net/problem/1158 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder("<");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int count = 0;
        while (queue.size() != 1) {
            count++;

            if (count % K == 0) {
                sb.append(queue.poll() + ", ");
                continue;
            }

            queue.add(queue.poll());
        }

        sb.append(queue.poll() + ">");
        System.out.print(sb);
    }
}
