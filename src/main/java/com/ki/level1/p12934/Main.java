package com.ki.level1.p12934;

public class Main {
}

class Solution {
    public long solution(long n) {
        long answer = 0;

        while(answer * answer < n){
            answer++;
        }

        if(answer * answer == n){
            answer++;
            return answer*answer;
        }

        return -1;
    }
}