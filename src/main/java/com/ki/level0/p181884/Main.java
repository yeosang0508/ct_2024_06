package com.ki.level0.p181884;

public class Main {
}

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (answer > n) {
                break;
            }
            answer += numbers[i];

        }
        return answer;
    }
}