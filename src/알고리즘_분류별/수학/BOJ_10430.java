package 알고리즘_분류별.수학;

/* https://www.acmicpc.net/problem/10430 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10430 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        sb.append((a + b) % c + "\n");
        sb.append(((a % c) + (b % c)) % c + "\n");
        sb.append((a * b) % c + "\n");
        sb.append(((a % c) * (b % c)) % c);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
