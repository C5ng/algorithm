package bruteforce;

/* https://www.acmicpc.net/problem/4673 */

public class BOJ_4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = i;
            int sum = n;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            if (sum > 10000) {
                continue;
            }

            arr[sum] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
}
