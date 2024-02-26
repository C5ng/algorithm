package hash;

/* https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java */

import java.util.HashMap;

public class PG_1845 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.keySet().size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = map.keySet().size();
        }


        return answer;
    }
}
