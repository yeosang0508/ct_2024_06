package com.ki.level0.p181927;

public class Main {

}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int a = num_list.length -1;
        int b = num_list.length -2;

        if(num_list[a] > num_list[b]){
            for(int i = 0; i < num_list.length; i++){
                answer[i] = num_list[i];
            }
            answer[answer.length-1] = num_list[a] - num_list[b];
        } else{
            for(int i = 0; i < num_list.length; i++){
                answer[i] = num_list[i];
            }
            answer[answer.length-1] = num_list[a] * 2;
        }
        return answer;
    }
}