package com.ki.level0.p181833;

public class Main {
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++) {
            answer[i][i] = 1;
            for(int j = 0; j < n; j++) {
                if(answer[i][j] == 1){
                    continue;
                }
                answer[i][j] = 0;
            }
        }
        return answer;
    }
}