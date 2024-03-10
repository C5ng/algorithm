package heap;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42626 */

import java.util.PriorityQueue;

public class PG_42626 {
    public static void main(String[] args) {
        System.out.print(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while (pq.size() != 1) {
            int scoville1 = pq.poll();
            int scoville2 = pq.poll();

            if (scoville1 >= K) {
                break;
            }

            pq.add(scoville1 + scoville2 * 2);
            answer++;
        }

        if (!pq.isEmpty() && pq.poll() < K) {
            answer = -1;
        }

        return answer;
    }
}
