package com.ki.level0.p181919;

public class Main {
}

class Solution {
    public int[] solution(int n) {


        String string = n + ",";

        int a = n;

        while(a > 1){
            if(a % 2 == 0) {
                string += (a / 2) + ",";
                a = a/2;
            } else{
                string += (3 * a + 1) + ",";
                a = 3 * a + 1;
            }
        }
        String[] answer = string.split(",");

        int[]result = new int[answer.length];

        for(int i = 0; i < answer.length; i++){
            result[i] = Integer.parseInt(answer[i]);
        }
        return result;
    }
}