package 알고리즘_분류별.큐;

/* https://www.acmicpc.net/problem/15828 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        while (true) {
            int k = Integer.parseInt(br.readLine());

            if (k == -1) {
                break;
            }

            if (k == 0) {
                queue.remove();
            } else {
                if (queue.size() != n) {
                    queue.add(k);
                }
            }
        }

        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            while (!queue.isEmpty()) {
                sb.append(queue.remove() + " ");
            }
        }

        System.out.print(sb.toString().trim());
    }
}
