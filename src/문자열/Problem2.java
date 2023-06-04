package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        /*
        * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
        * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int a = 'a';
//        int b = 'A';
//
//        System.out.println(a-b);
//        System.out.println(b);

        // 처음 주어진 문자열
        char[] str = br.readLine().toCharArray();
        // 문자열
        char s = br.readLine().toCharArray()[0];
        int count = 0;
        for(int i = 0 ; i < str.length; i++){
            if(s == str[i] || Math.abs(s - str[i]) == 32){
                count++;
            }
        }

        System.out.println(count);

    }
}
