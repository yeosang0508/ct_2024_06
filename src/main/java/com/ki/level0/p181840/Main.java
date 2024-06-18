package com.ki.level0.p181840;

public class Main {
}

class Solution {
    public int solution(int[] num_list, int n) {

        for(int i = 0; i <num_list.length; i++){
            if(num_list[i] == n){
                return 1;
            }
        }
        return 0;
    }
}