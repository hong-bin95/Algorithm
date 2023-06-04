package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        /*
        * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] strs = new String[N];

        for(int n = 0 ; n < N; n++){
            strs[n] = br.readLine();
        }

        for(int n = 0 ; n < N; n++) {
            for(int i = strs[n].length()-1; i >= 0 ; i--){
                System.out.print(strs[n].toCharArray()[i]);
            }
            System.out.println();
        }

    }
}
