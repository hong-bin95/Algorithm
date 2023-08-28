package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    
    int sum = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        go(numbers, 0, target, 0);
        answer = sum;
        return answer;
    }
    
    public void go(int[] numbers, int depth, int target, int result){
        if( depth == numbers.length ){
            if(target == result){
                sum ++;
            }
            return;
        }
        
        int a = result + numbers[depth];
        int b = result - numbers[depth];
        
        go(numbers, depth + 1, target, a);
        go(numbers, depth + 1, target, b);
    }
}
