package 알고리즘_분류별.문자열;

/* https://www.acmicpc.net/problem/2941 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int count = 0;

        s = br.readLine();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'c') {
                if(i != s.length()-1) {
                    ch = s.charAt(i + 1);
                    if (ch == '=') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                    if (ch == '-') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                }
                count = count + 1;
            } else if (ch == 'd') {
                if(i != s.length()-1) {
                    ch = s.charAt(i + 1);
                    if (ch == 'z') {
                        if(i != s.length()-2) {
                            ch = s.charAt(i + 2);
                            if (ch == '=') {
                                count = count + 1;
                                i = i + 2;
                                continue;
                            }
                        }
                    } else if (ch == '-') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                }
                count = count + 1;
            } else if (ch == 'l') {
                if(i != s.length()-1) {
                    ch = s.charAt(i + 1);
                    if (ch == 'j') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                }
                count = count + 1;
            } else if (ch == 'n'){
                if(i != s.length()-1) {
                    ch = s.charAt(i + 1);
                    if (ch == 'j') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                }
                count = count + 1;
            } else if (ch == 's'){
                if(i != s.length()-1) {
                    ch = s.charAt(i + 1);
                    if (ch == '=') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                }
                count = count + 1;
            } else if (ch == 'z'){
                if(i != s.length()-1) {
                    ch = s.charAt(i + 1);
                    if (ch == '=') {
                        count = count + 1;
                        i = i + 1;
                        continue;
                    }
                }
                count = count + 1;
            } else {
                count = count + 1;
            }

        }

        System.out.print(count);
    }
}
