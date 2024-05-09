package stack;

/* https://www.acmicpc.net/problem/1874 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int curNum = Integer.parseInt(br.readLine());

            while (count <= curNum) {
                stack.push(count);
                count++;
                sb.append("+" + "\n");
            }

            if (stack.peek() == curNum) {
                stack.pop();
                sb.append("-" + "\n");
            }
        }

        if (stack.isEmpty()) {
            System.out.print(sb);
        } else {
            System.out.print("NO");
        }
    }
}
