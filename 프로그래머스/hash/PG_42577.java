package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PG_42577 {
    public static void main(String[] args) {
        System.out.print(solution(new String[]{"12","123","1235","567","88"}));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length() - 1; j++) {
                map.put(phone_book[i].substring(0, j + 1), 1);
            }
        }


        for (int i = 0; i < phone_book.length; i++) {
            if (map.containsKey(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    public static boolean solution2(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
