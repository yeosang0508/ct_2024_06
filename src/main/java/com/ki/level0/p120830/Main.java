package com.ki.level0.p120830;

public class Main {
}
class Solution {
    public int solution(int n, int k) {
        int total;
        int ten = n / 10;
        if (ten != 0){
            total = (n * 12000) + ((k - ten) * 2000);
            return total;
        }else {
            total = (n * 12000) + (k  * 2000);
            return total;
        }

    }
}