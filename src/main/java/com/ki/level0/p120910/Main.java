package com.ki.level0.p120910;

public class Main {
}

class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for(int i = 1; i <= t; i++){
            answer = answer * 2;
        }
        return answer;
    }
}