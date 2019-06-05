package me.algo;

/**
 * Created by bomi on 2019-06-05.
 */
public class DescendingString {
    public static void main(String[] args) {

    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length()-1; i++) {
            for(int j=i+1; j<s.length(); j++) {
                if(arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        StringBuilder sb = new StringBuilder(arr.length);
        for(char ch : arr) {
            sb.append(ch);
        }

        return sb.toString();
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
