package stack;

/* https://www.acmicpc.net/problem/6198 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine());
            while (!stack.isEmpty()) {
                if (stack.peek() <= h) {
                    stack.pop();
                } else {
                    break;
                }
            }

            sum += stack.size();
            stack.push(h);
        }

        System.out.print(sum);
    }
}
