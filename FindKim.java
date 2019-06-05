package me.algo;

/**
 * Created by bomi on 2019-06-05.
 */
public class FindKim {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    private static String solution(String[] seoul) {
        int len = seoul.length;
        int i;
        for(i=0; i<len; i++) {
            if(seoul[i].length() != 3) {
                continue;
            }

            if("Kim".equals(seoul[i])) {
                break;
            }
        }
        return "김서방은 " + i + "에 있다";
    }
}
