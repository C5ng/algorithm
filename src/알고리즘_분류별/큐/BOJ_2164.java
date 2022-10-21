package 알고리즘_분류별.큐;

/* https://www.acmicpc.net/problem/2164 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.remove();
            queue.add(queue.remove());
        }

        System.out.print(queue.remove());
    }
}
