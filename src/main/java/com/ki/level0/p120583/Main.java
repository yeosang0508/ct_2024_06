package com.ki.level0.p120583;

public class Main {
}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i = 0; i < array.length; i ++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}