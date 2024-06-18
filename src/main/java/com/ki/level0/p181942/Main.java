package com.ki.level0.p181942;

public class Main {
}

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        String[] st1 = str1.split("");
        String[] st2 = str2.split("");

        for(int i = 0; i < st1.length; i++){
            answer += st1[i];
            answer += st2[i];
        }

        return answer;
    }
}