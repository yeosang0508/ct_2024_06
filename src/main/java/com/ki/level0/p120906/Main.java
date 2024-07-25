package com.ki.level0.p120906;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = ""+n;

        String[] num = str.split("");

        for(int i = 0; i < num.length; i++){
            answer += Integer.parseInt(num[i]);
        }

        return answer;
    }
}