package 알고리즘_분류별.스택;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42584 */

import java.util.Stack;

public class BOJ_42584 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i<prices.length; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek()[1] <= prices[i]) {
                    stack.push(new int[]{i, prices[i]});
                    break;
                } else {
                    int[] value = stack.pop();
                    answer[value[0]] = i - value[0];
                }
            }

            if (stack.isEmpty()) {
                stack.push(new int[]{i, prices[i]});
            }
        }

        while (!stack.isEmpty()) {
            int[] value = stack.pop();
            answer[value[0]] = prices.length - 1 - value[0];
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3 });
    }
}
