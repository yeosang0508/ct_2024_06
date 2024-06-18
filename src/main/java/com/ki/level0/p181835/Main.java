package com.ki.level0.p181835;

public class Main {
}

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(k % 2 == 1){
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }

        return answer;
    }
}