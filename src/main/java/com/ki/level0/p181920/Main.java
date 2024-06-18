package com.ki.level0.p181920;

public class Main {
}
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[(end_num-start_num)+1];
        int count = 0;

        for(int a = start_num; a <= end_num; a++){
            answer[count] += a;
            count++;
        }

        return answer;
    }
}