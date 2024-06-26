package hash;

import java.util.HashMap;

public class PG_42578 {
    public static void main(String[] args) {
        
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }


        for (String str : hm.keySet()) {
            answer *= (hm.get(str) + 1);
        }

        return answer - 1;
    }
}
