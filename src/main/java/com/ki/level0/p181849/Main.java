package com.ki.level0.p181849;

public class Main {
}

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        String[] numstr = num_str.split("");

        for(int i = 0; i < numstr.length; i++){
            answer += Integer.parseInt(numstr[i]);

        }
        return answer;
    }
}