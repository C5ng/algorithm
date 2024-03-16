package fs;

/* https://school.programmers.co.kr/learn/courses/30/lessons/43165 */

public class PG_43165 {
    public static void main(String[] args) {
        System.out.print(solution(new int[]{4, 1, 2, 1}, 2));
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, target, 0);

        return answer;
    }

    public static int dfs(int[] numbers, int sum, int target, int depth) {
        if (depth == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        } else {
            int count = 0; // 추가된 부분
            count += dfs(numbers, sum + numbers[depth], target, depth + 1);
            count += dfs(numbers, sum - numbers[depth], target, depth + 1);
            return count; // 수정된 부분

        }
    }


}
