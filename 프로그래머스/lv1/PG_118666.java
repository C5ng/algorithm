package lv1;

/* https://school.programmers.co.kr/learn/courses/30/lessons/118666 */

import java.util.HashMap;
import java.util.Map;

public class PG_118666 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] > 4) {
                map.put(String.valueOf(survey[i].charAt(1)), map.getOrDefault(String.valueOf(survey[i].charAt(1)), 0) + choices[i] - 4);
            } else if (choices[i] < 4) {
                map.put(String.valueOf(survey[i].charAt(0)), map.getOrDefault(String.valueOf(survey[i].charAt(0)), 0) + 4 - choices[i]);
            }
        }

        if (map.get("R") >= map.get("T")) {
            answer += "R";
        } else if (map.get("R") < map.get("T")) {
            answer += "T";
        }

        if (map.get("C") >= map.get("F")) {
            answer += "C";
        } else if (map.get("C") < map.get("F")) {
            answer += "F";
        }

        if (map.get("J") >= map.get("M")) {
            answer += "J";
        } else if (map.get("J") < map.get("M")) {
            answer += "M";
        }

        if (map.get("A") >= map.get("N")) {
            answer += "A";
        } else if (map.get("A") < map.get("N")) {
            answer += "N";
        }

        return answer;
    }
}
