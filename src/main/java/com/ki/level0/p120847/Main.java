package com.ki.level0.p120847;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return answer;
    }
}