package stack;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12909 */

import java.util.Stack;

public class PG_12909 {
    public static void main(String[] args) {
        System.out.print(solution("(()("));
    }

    public static boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                answer = false;
                break;
            }
        }

        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}
