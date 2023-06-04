package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();

        char[] chars = new char[(int)'z'];

        for(int i = 0 ; i < str.length ; i++){
            if(chars[str[i]] != 'z'){
                System.out.print(str[i]);
                chars[str[i]] = 'z';
            }
        }

    }
}
