package com.ki.level0.p181929;

public class Main {
}

class Solution {
    public int solution(int[] num_list) {
        int sum = num_list[0];
        int multi = num_list[0];

        for(int i = 1; i < num_list.length; i++){
            sum += num_list[i];
            multi *= num_list[i];
        }

        if((sum * sum) > multi){
            return 1;
        }
        return 0;
    }
}