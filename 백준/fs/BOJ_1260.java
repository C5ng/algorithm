package fs;

/* https://www.acmicpc.net/problem/1260 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static boolean[][] arr;
    static boolean[] visit;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        arr = new boolean[N + 1][N + 1];
        visit = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = true;
        }

        dfs(V);
        visit = new boolean[N + 1];
        System.out.println();
        bfs(V);
    }

    public static void dfs(int V) {
        visit[V] = true;
        System.out.print(V + " ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[V][i] && !visit[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int V) {
        queue.offer(V);
        visit[V] = true;

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            System.out.print(node + " ");

            for (int i = 1; i < arr.length; i++) {
                if (arr[node][i] && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
        System.out.println();

    }
}
