package com.ki.level0.p181863;

public class Main {
}

class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] rny = rny_string.split("");

        for (int i = 0; i < rny.length; i++) {
            if (rny[i].equals("m")) {
                rny[i] = "rn";
                answer += rny[i];
            } else {
                answer += rny[i];
            }
        }

        return answer;
    }
}