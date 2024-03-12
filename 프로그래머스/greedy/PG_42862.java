package greedy;

import java.util.Arrays;

public class PG_42862 {
    public static void main(String[] args) {
//        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
//        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
//        System.out.println(solution(3, new int[]{3}, new int[]{1}));
//        System.out.println(solution(7, new int[]{2, 4, 6}, new int[]{1, 3, 7}));
//        System.out.println(solution(3, new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(solution(5, new int[]{5, 3}, new int[]{4, 2}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        boolean[] students = new boolean[n + 1];
        Arrays.fill(students, true);
        students[0] = false;

        for (int i = 0; i < lost.length; i++) {
            students[lost[i]] = false;
        }

        for (int i = 0; i < reserve.length; i++) {
            if (!students[reserve[i]]) {
                students[reserve[i]] = true;
                reserve[i] = 0;
            }
        }

        Arrays.sort(reserve);

        for (int i = 0; i < reserve.length; i++) {

            if (reserve[i] == 0) {
                continue;
            }

            if (reserve[i] - 1 > 0 && !students[reserve[i] - 1]) {
                students[reserve[i] - 1] = true;
            } else if (reserve[i] + 1 < students.length && !students[reserve[i] + 1]) {
                students[reserve[i] + 1] = true;
            }
        }

        for (boolean flag : students) {
            if (flag) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution2(int n, int[] lost, int[] reserve) {
        int answer = 0;

        boolean[] students = new boolean[n + 1];
        Arrays.fill(students, true);
        students[0] = false;

        for (int i = 0; i < lost.length; i++) {
            students[lost[i]] = false;
        }

        for (int i = 0; i < reserve.length; i++) {

            if (!students[reserve[i]]) {
                students[reserve[i]] = true;
            } else if (reserve[i] - 1 > 0 &&!students[reserve[i] - 1]) {
                students[reserve[i] - 1] = true;
            } else if (reserve[i] + 1 < students.length &&!students[reserve[i] + 1]) {
                students[reserve[i] + 1] = true;
            }
        }

        for (boolean flag : students) {
            if (flag) {
                answer++;
            }
        }

        return answer;
    }

}
