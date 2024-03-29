package lv1;

public class PG_12922 {
    public static void main(String[] args) {

    }

    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        return answer;
    }
}
