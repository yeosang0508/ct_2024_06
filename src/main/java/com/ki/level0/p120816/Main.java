package com.ki.level0.p120816;

public class Main {
}
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        if(n % slice == 0){
            return n / slice;
        }

        answer = n / slice + 1;
        return answer;
    }
}