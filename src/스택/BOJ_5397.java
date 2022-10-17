package 스택;

/* https://www.acmicpc.net/problem/5397 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* stack을 두개 사용하여 커서위치에 따라 leftStack, rightStack을 사용했는데 채점결과에서 LinkedList를 사용할 경우 시간복잡도가 줄어들어 더 빠른것으로 보임 확인해보기. */

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                switch (c) {
                    case '<':
                        if (!leftStack.isEmpty()) {
                            rightStack.push(leftStack.pop());
                        }
                        break;
                    case '>':
                        if (!rightStack.isEmpty()) {
                            leftStack.push(rightStack.pop());
                        }
                        break;
                    case '-':
                        if (!leftStack.isEmpty()) {
                            leftStack.pop();
                        }
                        break;
                    default:
                        leftStack.push(c);
                        break;
                }
            }

            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }

            while (!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }

//            while (!leftStack.isEmpty()) {
//                sb.append(leftStack.pop());
//            }
//            while (!rightStack.isEmpty()) {
//                sb.append(rightStack.pop() + "\n");
//            }
//            System.out.print(sb.reverse());
//            위에 주석 코드로 진행할경우 출력초과가 뜨며 틀림. 왜 그런지 알아볼 필요

            sb.append("\n");
        }
        System.out.print(sb);
    }
}
