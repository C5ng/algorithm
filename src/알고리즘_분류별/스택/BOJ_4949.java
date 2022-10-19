package 알고리즘_분류별.스택;

/* https://www.acmicpc.net/problem/4949 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                } else if (c == ')') {
                    if (stack.empty() || stack.peek() == '[') {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.peek() == '(') {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.empty()) {
                flag = false;
            }

            if (!flag) {
                sb.append("no" + "\n");
            } else {
                sb.append("yes" + "\n");
            }

            flag = true;
            stack.clear();
        }

        System.out.print(sb);
    }
}
