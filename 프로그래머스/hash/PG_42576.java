package hash;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42576 */

import java.util.HashMap;

public class PG_42576 {
    public static void main(String[] args) {
        System.out.print(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : completion) {
            map.put(str, map.get(str)-1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
