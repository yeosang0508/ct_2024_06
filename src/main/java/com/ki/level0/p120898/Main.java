package com.ki.level0.p120898;

public class Main {

}

class Solution {
    public int solution(String message) {
        int answer = 0;

        String[] count = message.split("");

        answer = count.length * 2;


        return answer;
    }
}