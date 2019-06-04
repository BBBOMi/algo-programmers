package me.algo;

/**
 * Created by bomi on 2019-06-04.
 */
public class StringsBasic {
    public static void main(String[] args) {

    }

    private static boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;

        for(int i=0, ch; i<s.length(); i++) {
            ch = s.charAt(i);
            if('0' > ch || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
