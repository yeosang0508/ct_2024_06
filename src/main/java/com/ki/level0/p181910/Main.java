package com.ki.level0.p181910;

public class Main {
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] mystring = my_string.split("");

        for(int i = mystring.length - n; i < mystring.length; i ++){
            answer += mystring[i];
        }

        return answer;
    }
}