package 알고리즘_분류별.해시;

import java.util.HashMap;

public class PRO_42579 {
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            hm.put(genres[i], plays[i]);
        }
        System.out.print(hm);

        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        solution(genres, plays);
    }
}
