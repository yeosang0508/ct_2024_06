package com.ki.level0.p181935;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1 = n;


        if (n % 2 == 1) {
            while (num1 >= 1) {
                answer += num1;
                num1 -= 2;
            }
        } else {
            while (num1 >= 1) {
                answer += num1 * num1;
                num1 -= 2;
            }
        }

        return answer;
    }
}