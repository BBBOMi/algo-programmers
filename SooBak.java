package me.algo;

/**
 * Created by bomi on 2019-06-05.
 */
public class SooBak {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            if(i % 2 == 0) {
                sb.append("수");
                continue;
            }
            sb.append("박");
        }
        return sb.toString();
    }
}
