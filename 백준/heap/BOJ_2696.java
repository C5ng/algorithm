package heap;

/* https://www.acmicpc.net/problem/2696 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Queue<Integer> minHeap = new PriorityQueue<>();
            Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            int M = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int lines = M / 10 + 1;

            for (int j = 0; j < lines; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int size = st.countTokens();

                for (int k = 1; k <= size; k++) {
                    int n = Integer.parseInt(st.nextToken());

                    if (maxHeap.isEmpty() || n <= maxHeap.peek()) {
                        maxHeap.add(n);
                    } else {
                        minHeap.add(n);
                    }

                    if (maxHeap.size() > minHeap.size() + 1) {
                        minHeap.offer(maxHeap.poll());
                    } else if (maxHeap.size() < minHeap.size()) {
                        maxHeap.offer(minHeap.poll());
                    }

                    if (k % 2 == 1) {
                        count++;
                        sb.append(maxHeap.peek() + " ");
                    }
                }

                if (count % 10 == 0) {
                    sb.append("\n");
                }
            }

            System.out.println(count);
            System.out.println(sb);
        }
    }
}
