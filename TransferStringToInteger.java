package me.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bomi on 2019-06-05.
 */
public class TransferStringToInteger {
    public static void main(String[] args) {
        System.out.println(solution("-1234"));

    }

    private static int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<=9; i++) {
            map.put(i+"", i);
        }

        boolean negative;
        int num = 0;
        String[] arr = s.split("");
        for(int i=s.length()-1; i>=0; i--) {
            if(i == 0) {
                if(arr[i].equals("-")) {
                    negative = true;
                    num *= -1;
                    break;
                }
                if(arr[i].equals("+")) {
                    break;
                }
            }
            num += map.get(arr[i]) * Math.pow(10, s.length()-1-i);
        }

        return num;
    }
}
