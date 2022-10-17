package 스택;

/* https://www.acmicpc.net/problem/1406 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.substring(i, i+1));
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "L":
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case "D":
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case "B":
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case "P":
                    leftStack.push(st.nextToken());
                    break;
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
