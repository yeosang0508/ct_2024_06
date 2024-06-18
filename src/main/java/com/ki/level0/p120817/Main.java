package com.ki.level0.p120817;

public class Main {
}
class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        double total = 0;
        int res1 = 0;
        for(int i =0; i < numbers.length; i++){
            sum += numbers[i];
            total++;
        }
        double res = sum / total;
        res1 += res;

        if((res-res1)==0){
            return res;
        } else if((res - res1) == 0.5){
            return res;
        }

        return res1;

    }
}