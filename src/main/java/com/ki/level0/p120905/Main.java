package com.ki.level0.p120905;

public class Main {

}

class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }

        int[] answer = new int[count];

        int index = 0;

        for (int k = 0; k < numlist.length; k++) {
            if (numlist[k] % n == 0) {
                answer[index] = numlist[k];
                index++;
            }
        }

        return answer;
    }
}