package me.algo;

/**
 * Created by bomi on 2019-06-04.
 */
public class GetMiddleString {
    public static void main(String[] args) {
        String result = solution("qwer");
        System.out.println(result);
    }

    private static String solution(String s) {
        int middle = s.length()%2 == 0 ? s.length()/2 - 1 : s.length()/2;
        int end = s.length()/2 + 1;

        String answer =  s.substring(middle, end);
        return answer;
    }
}
