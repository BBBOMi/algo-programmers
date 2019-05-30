package me.algo;


/**
 * Created by bomi on 2019-05-30.
 */
public class TargetNumber {
    static int answer;
    public static void main(String[] args) {
        solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(answer);
    }

    static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return answer;
    }

    static void dfs(int[] arr, int target, int depth) {
        if(arr.length == depth) {
            int sum = 0;
            for(int n : arr) {
                sum += n;
            }
            if(sum == target) {
                ++answer;
            }
            return;
        }

        arr[depth] *= 1;
        dfs(arr, target, depth+1);

        arr[depth] *= -1;
        dfs(arr, target, depth+1);
    }

}
