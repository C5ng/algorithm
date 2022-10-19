package 알고리즘_분류별.스택;

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
        Stack<int[]> stack = new Stack<>();

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if (stack.peek()[1] < n) {
                    arr[stack.pop()[0]] = n;
                } else if (stack.peek()[1] >= n) {
                    stack.push(new int[]{i, n});
                    break;
                }
            }

            if (stack.isEmpty()) {
                stack.push(new int[]{i, n});
            }
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()[0]] = -1;
        }

        for (int i : arr) {
            sb.append(i + " ");
        }

        System.out.print(sb);
    }
}
