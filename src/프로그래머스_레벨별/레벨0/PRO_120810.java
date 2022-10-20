package 프로그래머스_레벨별.레벨0;

/* https://school.programmers.co.kr/learn/courses/30/lessons/120810 */

public class PRO_120810 {
    public static int solution(int num1, int num2) {
        int answer = num1 % num2;

        return answer;
    }

    public static void main(String[] args) {
        solution(3, 2);
    }
}
