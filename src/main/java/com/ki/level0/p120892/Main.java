package com.ki.level0.p120892;

public class Main {
}

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i = code - 1; i < cipher.length(); i += code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}