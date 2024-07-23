package com.ki.level0.p120826;

public class Main {
}

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";

        String[] strings = my_string.split("");

        int count = 0;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].equals(letter)) {
                count++;
            }
        }

        String[] str = new String[my_string.length() - count];

        int num = 0;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].equals(letter)) {
                continue;
            }
            str[num++] = strings[i];
        }

        answer = String.join("", str);
        return answer;
    }
}