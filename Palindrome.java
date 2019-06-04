package me.algo;

/**
 * Created by bomi on 2019-06-04.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solution("abcdcba"));
    }

    private static int solution(String s) {
        int answer = 1;
        int j;
        for(int i=1; i<s.length(); i++) {
            j = 1;
            while((i >= j) &&  (i+j < s.length()) && (s.charAt(i+j) == s.charAt(i-j))) {
                j++;
            }
            if(j * 2 - 1 > answer) {
                answer = j * 2 - 1;
            }
        }
        return answer;
    }

}
