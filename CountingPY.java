package me.algo;

/**
 * Created by bomi on 2019-06-04.
 */
public class CountingPY {
    public static void main(String[] args) {

    }

    private static boolean solution(String s) {
        int p=0, y=0;
        s = s.toLowerCase();
        for(int i=0, ch; i<s.length(); i++) {
            ch = s.charAt(i);
            if(ch == 'p') {
                p++;
                continue;
            }
            if(ch == 'y') {
                y++;
            }
        }
        return p == y;
    }
}
