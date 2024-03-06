package stack;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42584 */

import java.util.Stack;

public class PG_42584 {
    public static void main(String[] args) {
        System.out.print(solution(new int[]{2, 2, 3, 1, 5}));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<int[]> stack = new Stack<>();
        int second = 0;
        for (int i = 0; i < prices.length; i++) {
            second++;

            if (stack.isEmpty()) {
                stack.push(new int[]{prices[i], second});
                continue;
            }

            while (!stack.isEmpty() && stack.peek()[0] > prices[i]) {
                int[] prePrice = stack.pop();
                answer[prePrice[1] - 1] = second - prePrice[1];
            }

            stack.push(new int[]{prices[i], second});
        }

        while (!stack.isEmpty()) {
            int[] prePrice = stack.pop();;
            answer[prePrice[1] - 1] = second - prePrice[1];
        }

        return answer;
    }
}
