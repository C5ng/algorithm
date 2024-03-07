package stack;

/* https://www.acmicpc.net/problem/17298 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if (stack.peek()[0] < A) {
                    answer[stack.pop()[1]] = A;
                } else {
                    break;
                }
            }

            stack.push(new int[]{A, i});
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()[1]] = -1;
        }

        for (int i : answer) {
            sb.append(i + " ");
        }

        System.out.print(sb);
    }
}
