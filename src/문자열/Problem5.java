package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        /*
         * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
         * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
         * */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        // 입력받은것들 중 문자열만 저장
        char[] real_chars = new char[chars.length];
        // 문자열의 길이
        int char_count = 0;

        int middle = chars.length / 2;

        for(int i = 0 ; i < chars.length ; i++){
            if(chars[i] >= 'A' && chars[i] <= 'z') {
                real_chars[char_count++] = chars[i];
                chars[i] = 'a';
            }
        }

        // 'a'인 곳은 문자열의 자리니까 하나씩 넣어준다.
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == 'a'){
                chars[i] = real_chars[--char_count];
            }
        }

        // 중간까지 간다
//        for(int i = 0 ; i < middle; i ++){
//            // 가면서 알파벳이면
//            if(chars[i] >= 'A' && chars[i] <= 'z'){
//                char temp = chars[i];
//                chars[i] = chars[chars.length -1 - i];
//                chars[chars.length -1 - i] = temp;
//            }
//        }

        System.out.println(chars);






    }
}
