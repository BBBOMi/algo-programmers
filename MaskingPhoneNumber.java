package me.algo;

/**
 * Created by bomi on 2019-06-05.
 */
public class MaskingPhoneNumber {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));

    }

    private static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number.length());
        int len = phone_number.length() - 4;
        for(int i=0; i<len; i++) {
            sb.append("*");
        }
        String sub = phone_number.substring(len);
        sb.append(sub);

        return sb.toString();
    }
}
