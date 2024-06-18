package com.ki.level0.p181901;

public class Main {

}
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int count = 0;

        for(int i = 0; i < answer.length; i++){
            answer[i] = count + k;
            count += k;
        }


        return answer;
    }
}