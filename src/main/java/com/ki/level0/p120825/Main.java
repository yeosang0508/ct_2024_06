package com.ki.level0.p120825;

public class Main {
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        String[] strings = my_string.split("");

        for(int i = 0; i < my_string.length(); i++) {
            answer += strings[i].repeat(n);
        }


        return answer;
    }
}