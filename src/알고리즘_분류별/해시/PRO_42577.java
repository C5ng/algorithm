package 알고리즘_분류별.해시;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42557 */

import java.util.Arrays;

public class PRO_42577 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

//        Arrays.sort(phone_book, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        }); 길이를 비교하여 정렬하도록 구현한 메서드

        Arrays.sort(phone_book); // 위에 메서드를 사용하지 않고 기본 sort를 사용해도 "접두어" 를 비교하기에는 상관없다.

//        for (int i = 0; i < phone_book.length - 1; i++) {
//            for (int j = i + 1; j < phone_book.length; j++) {
//                if (phone_book[j].startsWith(phone_book[i])) {
//                    answer = false;
//                    break;
//                }
//            }
//
//            if (!answer) {
//                break;
//            }
//        }

        for (int i = 0; i < phone_book.length; i++) {
            if (i == phone_book.length - 1) {
                break;
            }

            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};

        System.out.print(solution(phone_book));
    }
}
