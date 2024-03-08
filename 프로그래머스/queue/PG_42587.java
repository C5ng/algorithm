package queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PG_42587 {
    public static void main(String[] args) {
        System.out.print(solution(new int[]{2,1,33,100}, 1));
    }

    public static int solution(int[] priorities, int location) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(a, b));

        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        }

        System.out.println(pq);

        // 출력 시 위치 정보 확인
        while (!pq.isEmpty()) {
            int element = pq.poll();
            System.out.println("Value: " + element);
        }

        return 0;
    }

    public static int solution2(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            if (queue.isEmpty()) {
                queue.add(priorities[i]);
                continue;
            }

            int size = queue.size();
            for (int j = 0; j < size; j++) {
                if (queue.peek() < priorities[i]) {
                    queue.add(queue.poll());
                    continue;
                }

                queue.add(priorities[i]);
            }


            queue.add(priorities[i]);
        }

        System.out.println(queue);

        return answer;
    }
}
