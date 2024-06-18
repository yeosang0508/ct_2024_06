package com.ki.level0.p120822;

public class Main {
}

class Solution {
    public String solution(String my_string) {
        String answer = "";

        String[] turn = my_string.split("");
        int result = turn.length;

        for(int i = 0; i < turn.length; i++ ){
            result--;
            turn[i] = turn[result];
        }

        answer = String.join("",turn);

        return answer;
    }
}