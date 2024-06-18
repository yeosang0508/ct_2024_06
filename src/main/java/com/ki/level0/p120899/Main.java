package com.ki.level0.p120899;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int maxNum = 0;
        int indexNum = 0;
        for (int i = 0; i <array.length ; i++){
            if (array[i] > maxNum) {
                maxNum = array[i];
                indexNum = i;
            }
        }
        answer[0] = maxNum;
        answer[1] = indexNum;

        return answer;
    }
}