package 알고리즘_분류별.큐;

/* https://www.acmicpc.net/problem/11866 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 1;

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        sb.append("<");
        while (queue.size() != 1) {
            if (count % k == 0) {
                sb.append(queue.remove() + ", ");
                count = 1;
            } else {
                queue.add(queue.remove());
                count++;
            }
        }
        sb.append(queue.remove() + ">");

        System.out.print(sb);
    }
}
