package com.ki.level0.p181879;

public class Main {
}

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        }

        if(num_list.length < 11){
            answer = 1;
            for(int i = 0; i < num_list.length; i++){
                answer *= num_list[i];
            }
        }
        return answer;
    }
}