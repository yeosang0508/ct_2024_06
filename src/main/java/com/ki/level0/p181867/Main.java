package com.ki.level0.p181867;

public class Main {
}

class Solution {
    public int[] solution(String myString) {
        String[] strings = myString.split("x", myString.length());

        int[] answer = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].length();
        }
        return answer;
    }
}