package 알고리즘_분류별.스택;

/* https://www.acmicpc.net/problem/10799 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        String str = br.readLine();
        char preC = '(';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '(':
                    stack.push('(');
                    preC = '(';
                    break;
                case ')':
                    stack.pop();
                    if (preC == '(') {
                        answer += stack.size();
                    } else if (preC == ')') {
                        answer += 1;
                    }
                    preC = ')';
                    break;
            }
        }

        System.out.print(answer);
    }
}
