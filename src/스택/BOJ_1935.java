package 스택;

/* https://www.acmicpc.net/problem/1935 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        } // A B .. 해당하는 알파벳에 값을 주기위하여 아스키코드를 사용하여 배열에 저장한다.

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            double firNum = 0;
            double secNum = 0;
            switch (c) {
                case '+':
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '-':
                    firNum = stack.pop();
                    secNum = stack.pop();
                    stack.push(secNum - firNum);
                    break;
                case '*':
                    stack.push(stack.pop() * stack.pop());
                    break;
                case '/':
                    firNum = stack.pop();
                    secNum = stack.pop();
                    stack.push(secNum / firNum);
                    break;
                default:
                    stack.push(arr[c - 65]); // 아스키코드를 이용하여 값을 해당하는 문자의 값을 불러와 stack에 저장한다.
                    break;
            }
        }

        System.out.print(String.format("%.2f", stack.pop()));
    }
}
