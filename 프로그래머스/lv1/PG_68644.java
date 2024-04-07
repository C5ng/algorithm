package lv1;

/* https://school.programmers.co.kr/learn/courses/30/lessons/68644 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PG_68644 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 4, 1}));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }

        Object[] arr = set.toArray();
        Arrays.sort(arr);

        answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = (int) arr[i];
        }

        return answer;
    }
}
