package 알고리즘_분류별.큐;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42586 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PRO_42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<int[]> queue = new LinkedList<>();
        int[] answer = new int[100];
        for (int i = 0; i < progresses.length; i++) {
            queue.add(new int[]{progresses[i], speeds[i]});
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int[] front = queue.peek();
            int sum = front[0] + front[1] * count;
            while (sum < 100) {
                sum += front[1];
                count++;
            }
            queue.remove();
            answer[count]++;
        }

        return Arrays.stream(answer).filter(i -> i!=0).toArray();
    }

    public static void main(String[] args) {
        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }
}
