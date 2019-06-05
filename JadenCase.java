package me.algo;

/**
 * Created by bomi on 2019-06-05.
 */
public class JadenCase {
    public static void main(String[] args) {
        System.out.println(solution("hF tG 4 l"));

    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean upper = true;
        s = s.toLowerCase();
        char ch;
        for(int i=0; i<s.length(); i++) {
            ch = s.charAt(i);
            if(upper) {
                ch = Character.toUpperCase(ch);
                upper = false;
            }
            if(ch == ' ') {
                upper = true;
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
