package 알고리즘_분류별.스택;

/* https://www.acmicpc.net/problem/1874 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            for (int j = count; j <= k; j++) {
                stack.push(count);
                count++;
                sb.append("+" + "\n");
            }

            if (stack.peek() == k) {
                stack.pop();
                sb.append("-" + "\n");
            }
        }

        if (!stack.isEmpty()) {
            sb = new StringBuilder("NO");
        }
        System.out.print(sb);
    }
}
