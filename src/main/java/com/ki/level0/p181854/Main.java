package com.ki.level0.p181854;

public class Main {

}

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int count = 0;

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    answer[count] = arr[i] + n;
                    count++;
                } else{
                    answer[count] = arr[i];
                    count++;
                }
            }

        } else {
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 ==1) {
                    answer[count] = arr[i] + n;
                    count++;
                } else{
                    answer[count] = arr[i];
                    count++;
                }
            }
        }

        return answer;
    }
}