package com.ki.level0.p181931;

public class Main {
}

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer += a+(d*i);
            }
        }
        return answer;
    }
}