package com.ki.level0.p181861;

public class Main {
}

class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int[] answer = new int[sum];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i]; k++) {
                answer[count++] = arr[i];
            }
        }

        return answer;
    }
}