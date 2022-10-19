package 스택;

/* https://www.acmicpc.net/problem/17299 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17299 {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            Stack<int[]> stack = new Stack<>();
            HashMap<Integer, Integer> hm = new HashMap<>();

            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];
            int[] answer = new int[size];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i] = n; // 입력받는 순서 출력
                hm.put(n, hm.getOrDefault(n, 0) + 1); // 등장하는 횟수를 저장하기 위한 해시맵
            }

            for (int i = 0; i < size; i++) {
                int n = arr[i];

                while (!stack.isEmpty()) {
                    if (stack.peek()[1] < hm.get(n)) {
                        answer[stack.pop()[0]] = n;
                    } else if (stack.peek()[1] >= hm.get(n)) {
                        stack.push(new int[]{i, hm.get(n)});
                        break;
                    }
                }

                if (stack.isEmpty()) {
                    stack.push(new int[]{i, hm.get(n)});
                }
            }

            while (!stack.isEmpty()) {
                answer[stack.pop()[0]] = -1;
            }

            for (int i : answer) {
                sb.append(i + " ");
            }

            System.out.print(sb);
        }
    }
}
