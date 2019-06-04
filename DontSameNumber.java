package me.algo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bomi on 2019-06-04.
 */
public class DontSameNumber {
    public static void main(String[] args) throws IOException {
        int[] result = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int length = arr.length;

        for(int i=0, num; i<length; i++) {
            num = arr[i];
            if(i != 0 && list.get(list.size()-1) == num) {
                continue;
            }
            list.add(num);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
