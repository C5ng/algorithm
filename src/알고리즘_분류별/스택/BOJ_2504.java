package 알고리즘_분류별.스택;

/* https://www.acmicpc.net/problem/2504 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        boolean flag = true;

        String str = br.readLine().trim();
        int curStack = 1;
        char preC = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '(':
                    stack.push('(');
                    curStack *= 2;
                    preC = '(';
                    break;
                case '[':
                    stack.push('[');
                    curStack *= 3;
                    preC = '[';
                    break;
                case ')':
                    if (stack.isEmpty() || preC == '[' || stack.peek() =='[') {
                        flag = false;
                    } else if (preC == ')' || preC ==']'){
                        curStack /= 2;
                        stack.pop();
                    } else if (stack.peek() == '(' && preC == '(') {
                        answer += curStack;
                        curStack /= 2;
                        stack.pop();
                    }
                    preC = ')';
                    break;
                case ']':
                    if (stack.isEmpty() || preC == '(' || stack.peek() =='(') {
                        flag = false;
                    } else if (preC == ']' || preC ==')') {
                        curStack /= 3;
                        stack.pop();
                    } else if (stack.peek() == '[' && preC == '[') {
                        answer += curStack;
                        curStack /= 3;
                        stack.pop();
                    }
                    preC = ']';
                    break;
                default:
                    flag = false;
                    break;
            }
            if (!flag) {
                answer = 0;
                break;
            }

            if (stack.isEmpty()) {
                curStack = 1;
            }
        }

        if (!stack.isEmpty()) {
            answer = 0;
        }

        System.out.print(answer);
    }
}
