package 스택;

/* https://www.acmicpc.net/problem/3986 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 좋은단어가 되지않는 조건은 ABAB 처럼 서로다른 알파벳이 두 차례 교차할 때이다. 즉 좋은단어는 각 자리를 stack.peek()을 하여 비교를 후 같을 경우 stack에서 pop을 하고
    다를 경우 stack에 push를 하여 최종적으로 stack에 남아있는 경우가 없으면 좋은단어이다. 만약 좋은단어가 아닌 단어라면 ABAB처럼 stack에 남아있는 경우가 생김. 혹은 길이가 홀수. */

public class BOJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.empty()) {
                    stack.push(c);
                    continue;
                }

                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }

            stack.clear();
        }

        System.out.print(answer);
    }
}
