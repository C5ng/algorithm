package 알고리즘_분류별.해시;

/* https://school.programmers.co.kr/learn/courses/30/lessons/1845 */

import java.util.HashMap;

public class PRO_1845 {
    public static int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int size = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(hm.get(nums[i]), 0) + 1);
        }

        if (size >= hm.keySet().size()) {
            answer = hm.keySet().size();
        } else {
            answer = size;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};

        System.out.print(solution(nums));
    }
}
