package com.ki.level0.p120821;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        int count = num_list.length-1;
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[count];
            count--;
        }


        return answer;
    }
}