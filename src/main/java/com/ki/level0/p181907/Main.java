package com.ki.level0.p181907;

public class Main {

}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        String[] mystring = my_string.split("");
        for(int i = 0; i < n; i++){
            answer += mystring[i];
        }
        return answer;
    }
}