package com.ki.level0.p120812;

import java.util.Arrays;

public class Main {
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int[] big = new int[array.length];
        int count = 0;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] < array[i+1]){
                continue;
            }
        }
        return answer;
    }
}