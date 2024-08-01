package com.ki.level0.p120835;

public class Main {
}
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] <= emergency[j]){
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}