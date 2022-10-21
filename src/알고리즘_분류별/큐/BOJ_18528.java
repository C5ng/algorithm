package 알고리즘_분류별.큐;

/* https://www.acmicpc.net/problem/18258 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_18528 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.poll() + "\n");
                    } else {
                        sb.append("-1" + "\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append("1" + "\n");
                    } else {
                        sb.append("0" + "\n");
                    }
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        sb.append(queue.getFirst() + "\n");
                    } else {
                        sb.append("-1" + "\n");
                    }
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        sb.append(queue.getLast() + "\n");
                    } else {
                        sb.append("-1" + "\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}
