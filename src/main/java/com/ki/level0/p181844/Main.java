package com.ki.level0.p181844;

public class Main {
}

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < delete_list.length; k++) {
                if (arr[i] == delete_list[k]) {
                    arr[i] = 0;

                    count++;
                }
            }
        }

        int[] answer = new int[arr.length - count];
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[a++] = arr[i];
            }
        }
        return answer;
    }
}