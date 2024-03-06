package stack;

/* https://www.acmicpc.net/problem/1935 */
/* float double 차이 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BOJ_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Double> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            double value = Integer.parseInt(br.readLine());
            Character c = (char) (65 + i);
            map.put(c, value);
        }

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (65 <= c && c <= 90) {
                stack.push(map.get(c));
            } else if (c == '*') {
                double num2 = stack.pop();
                double num1 = stack.pop();

                stack.push(num1 * num2);
            } else if (c == '/') {
                double num2 = stack.pop();
                double num1 = stack.pop();

                stack.push(num1 / num2);
            } else if (c == '+') {
                double num2 = stack.pop();
                double num1 = stack.pop();

                stack.push(num1 + num2);
            } else if (c == '-') {
                double num2 = stack.pop();
                double num1 = stack.pop();

                stack.push(num1 - num2);
            }
        }

        String result = String.format("%.2f", stack.pop());
        System.out.printf(result);

    }
}
