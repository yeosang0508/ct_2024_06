package com.ki.level0.p181839;

public class Main {
}

class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        if (a % 2 == 1 && b % 2 == 1) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        } else {
            if (a < b) {
                answer = b - a;
            } else {
                answer = a - b;
            }
        }
        return answer;
    }
}