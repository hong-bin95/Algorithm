package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        /*
        * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
         * */

//        int a = 'a';    //97
//        int A = 'A';    //65
//        int z = 'z';    //122
//        int Z = 'Z';    //90

        // 대문자 A 는 65 소문자 z = 122
        char[] chars = new char[123];

        for(int i = 65 ; i <= 96; i++){
            chars[i] = (char)(i + 32);
        }

        for(int i = 97 ; i <= 122; i++){
            chars[i] = (char)(i - 32);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] inputs = br.readLine().toCharArray();

        for(int i = 0 ; i < inputs.length; i++){
            System.out.print(chars[inputs[i]]);
        }




    }
}
