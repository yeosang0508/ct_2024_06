package com.ki.level0.p120891;

public class Main {
}

class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = Integer.toString(order);

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if( ch == '3' || ch == '6' || ch == '9' ){
                answer ++;
            }
        }

        return answer;
    }
}