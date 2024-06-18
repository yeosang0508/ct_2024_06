package com.ki.level0.p181933;

public class Main {
}

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag == true){
            answer = a + b;
        }else {
            answer = a - b;
        }
        return answer;
    }
}