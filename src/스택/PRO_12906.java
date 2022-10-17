package 스택;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12906 */

import java.util.Stack;

public class PRO_12906 {
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                continue;
            }

            if (stack.peek() == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 1; i <= answer.length; i++) {
            answer[answer.length - i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        solution(arr);
    }
}
