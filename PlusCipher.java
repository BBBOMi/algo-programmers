package me.algo;

/**
 * Created by bomi on 2019-06-05.
 */
public class PlusCipher {
    public static void main(String[] args) {

    }

    private static int solution(int n) {
        int answer = 0;
        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
