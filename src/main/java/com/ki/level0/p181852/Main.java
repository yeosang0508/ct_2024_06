package com.ki.level0.p181852;

import java.util.Arrays;

public class Main {
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int count = 0;

        Arrays.sort(num_list);
        for(int i = 5; i < num_list.length; i++){
            answer[count++] = num_list[i];
        }

        return answer;
    }
}