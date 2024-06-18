package com.ki.level0.p120893;


public class Main {
}
class Solution {
    public String solution(String my_string) {
        String answer = "";


        String[] str = my_string.split("");

        for(char x : my_string.toCharArray()){
            if(x >= 97 && x <= 122) {
                answer += (char)(x-32);
            }else if(x >= 65 && x <= 90) {
                answer += (char)(x+32);
            }
        }
        return answer;
    }
}