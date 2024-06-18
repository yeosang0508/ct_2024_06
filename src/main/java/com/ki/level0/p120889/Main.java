package com.ki.level0.p120889;

public class Main {
}

class Solution {
    public int solution(int[] sides) {

        int max = 0;
        int index = 0;

        for(int i = 0; i < sides.length; i++){
            if(sides[i] > max){
                max = sides[i];
                index = i;
            }
        }

        int sum = 0;
        for(int k = 0; k < sides.length; k++){
            if(k != index){
                sum += sides[k];
            }
        }

        if (sum > max) return 1;


        return 2;
    }
}