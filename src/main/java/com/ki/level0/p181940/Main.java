package com.ki.level0.p181940;

public class Main {
}

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 1; i <= k ; i++){
            answer += my_string;
        }

        return answer;
    }
}