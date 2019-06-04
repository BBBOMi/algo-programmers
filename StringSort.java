package me.algo;

import java.util.*;

/**
 * Created by bomi on 2019-06-04.
 */
public class StringSort {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"abce", "abcd", "cdx"}, 2);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();

        for(int i=1; i<answer.length; i++) {
            for(int j=0; j<i; j++) {
                int res = compare(answer[i], answer[j], n, n);
                if(res < 0) {
                    swap(answer, i, j);
                }
            }
        }
        return answer;
    }

    private static int compare(String str1, String str2, int n, int now) {
        if(str1.charAt(now) > str2.charAt(now))
            return 1;
        if(str1.charAt(now) == str2.charAt(now)) {
            int next = n == now ? 0 : ++now;
            if(next == n) ++next;
            return compare(str1, str2, n, next);
        }
        return  -1;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
