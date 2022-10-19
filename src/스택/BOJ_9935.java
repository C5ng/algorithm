package 스택;

/* https://www.acmicpc.net/problem/9935 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String bStr = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            boolean flag = true; // 폭발문자열을 포함하는지 판단하는 변수

            if (stack.size() >= bStr.length()) {
                for (int j = 0; j < bStr.length(); j++) {
                    if (stack.get(stack.size() - bStr.length() + j) != bStr.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int j = 0; j < bStr.length(); j++) {
                        stack.pop();
                    };
                }
            }
        }

        for (char i : stack) {
            sb.append(i);
        }

        System.out.print(sb.length() == 0 ? "FRULA" : sb);

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bStr = br.readLine();

        while (str.contains(bStr)) {
            str = str.replace(bStr, "");
        }

        if (str.equals("")) {
            System.out.print("FRULA");
        } else {
            System.out.print(str);
        }
         */
    }
}
