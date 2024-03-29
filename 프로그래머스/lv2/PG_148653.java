package lv2;

public class PG_148653 {
    public static void main(String[] args) {
        System.out.println(solution(2799));
    }

    public static int solution(int storey) {
        int answer = 0;

        int length = String.valueOf(storey).length();
        int[] arr = new int[length + 1];

        for (int i = 0; i < length; i++) {
            int n = storey % 10;

            if (n > 5) {
                arr[i] += 10 - n;
                storey += 10;
            } else {
                arr[i] += n;
            }

            storey /= 10;
        }

        for (int i : arr) {
            answer += i;
        }

        return answer;
    }
}
