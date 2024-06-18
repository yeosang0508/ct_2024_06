package com.ki.level0.p120811;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int a = 0;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            a++;
        }
        for (int j = 0; j < array.length; j++) {
            answer = array[a / 2];
        }
        return answer;
    }
}

