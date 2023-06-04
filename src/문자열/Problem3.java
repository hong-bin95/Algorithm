package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        /*
        한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
        문장속의 각 단어는 공백으로 구분됩니다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] strs = str.split(" ");

        String result = "";

        for(int i = 0 ; i < strs.length; i++){
            if(result.length() <= strs[i].length()){
                result = strs[i];
            }
        }

        System.out.println(result);
    }
}
