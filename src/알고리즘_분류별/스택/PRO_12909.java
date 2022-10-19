package 알고리즘_분류별.스택;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12909 */

import java.util.Stack;

public class PRO_12909 {
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.empty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        if (!stack.empty()) {
            answer = false;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.print(solution("(()("));
    }
}
