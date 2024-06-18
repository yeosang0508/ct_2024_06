package com.ki.level0.p181928;

public class Main {
}

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                odd += Integer.toString(num_list[i]);
            }else{
                even += Integer.toString(num_list[i]);
            }
        }

        int odd1 = Integer.parseInt(odd);
        int odd2 = Integer.parseInt(even);

        answer = odd1 + odd2;

        return answer;
    }
}