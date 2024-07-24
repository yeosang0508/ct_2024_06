package com.ki.level0.p120895;

public class Main {
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] answer = my_string.split("");

        String str = "";

        str = answer[num1];

        answer[num1] = answer[num2];
        answer[num2] = str;

        String string = "";

        for(int i = 0; i <answer.length; i++) {
            string += answer[i];
        }

        return string;
    }
}