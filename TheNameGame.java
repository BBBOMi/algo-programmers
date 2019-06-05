package me.algo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bomi on 2019-06-05.
 */
public class TheNameGame {
    public static void main(String[] args) {

    }

    private static int[] solution(int n,  String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        set.add(words[0]);

        char preLast = words[0].charAt(words[0].length()-1);
        String str;
        for(int i=1; i<words.length; i++) {
            str = words[i];
            if(set.contains(str) || preLast != str.charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            set.add(str);
            preLast = str.charAt(str.length()-1);
        }
        return answer;
    }
}
