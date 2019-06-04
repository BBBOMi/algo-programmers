package me.algo;

/**
 * Created by bomi on 2019-06-04.
 */
public class MakeStrangeStrings {
    public static void main(String[] args) {
        String result = solution("try hello world");
        System.out.println(result);

    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();
        boolean flag = true;
        StringBuilder sb = new StringBuilder(s.length());

        for(char ch : arr) {
            if(flag) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
            flag = ch == ' ' || !flag;
        }
        return sb.toString();
    }
}
