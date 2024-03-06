package queue;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42586 */

import java.util.*;

public class PG_42586 {
    public static void main(String[] args) {
        System.out.print(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        ArrayList<int[]> arr = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            arr.add(new int[]{progresses[i], speeds[i]});
        }

        int day = 0;
        int count = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (!arr.isEmpty()) {
            if (arr.get(0)[0] + arr.get(0)[1] * day >= 100) {
                arr.remove(0);
                count++;
                map.put(day, count);
                continue;
            }

            count = 0;
            day += 1;
        }

        answer = new int[map.size()];
        int index = 0;
        for (Integer i : map.values()) {
            answer[index] = i;
            index++;
        }

        return answer;
    }
}
