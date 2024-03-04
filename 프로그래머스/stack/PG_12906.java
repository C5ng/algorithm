package stack;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12906 */

import java.util.ArrayList;

public class PG_12906 {
    public static void main(String[] args) {
        System.out.print(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        int preNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == preNum) {
                continue;
            }

            arrayList.add(arr[i]);
            preNum = arr[i];
        }

        answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
